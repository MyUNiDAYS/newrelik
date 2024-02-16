package com.myunidays.newrelik

import cocoapods.NewRelicAgent.NRMAFeatureFlags
import com.rickclephas.kmp.nserrorkt.asNSError
import platform.Foundation.NSError
import platform.Foundation.NSException
import platform.Foundation.NSNumber

actual class NewRelic internal constructor(val ios: cocoapods.NewRelicAgent.NewRelic) {

    actual fun start() {
        // no need to do anything here for ios, simply a polyfill for Android
    }

    actual fun crashNow() {
        cocoapods.NewRelicAgent.NewRelic.crashNow()
    }

    actual fun enableFeature(featureFlag: FeatureFlag) {
        cocoapods.NewRelicAgent.NewRelic.enableFeatures(featureFlag.ios)
    }

    actual fun setInteractionName(name: String?) {
        cocoapods.NewRelicAgent.NewRelic.customNewRelicInteractionName(name)
    }

    actual fun startInteraction(actionName: String) {
        cocoapods.NewRelicAgent.NewRelic.startInteraction(actionName)
    }

    actual fun endInteraction(id: String) {
        cocoapods.NewRelicAgent.NewRelic.stopInteraction(id)
    }

    actual fun currentSessionId() {
        cocoapods.NewRelicAgent.NewRelic.currentSessionId()
    }

    actual fun recordBreadcrumb(breadcrumbName: String, attributes: Map<String?, Any?>) {
        cocoapods.NewRelicAgent.NewRelic.recordBreadcrumb(breadcrumbName, attributes)
    }

    actual fun recordHandledException(exception: Exception?, exceptionAttributes: Map<String?, Any?>?) {
        cocoapods.NewRelicAgent.NewRelic.recordHandledException(exception, exceptionAttributes)
    }

    actual fun recordHandledException(throwable: Throwable) {
        cocoapods.NewRelicAgent.NewRelic.recordHandledException(throwable.asNSException())
    }

    actual fun recordHandledException(throwable: Throwable?, attributes: Map<String?, Any?>?) {
        cocoapods.NewRelicAgent.NewRelic.recordHandledException(throwable, attributes)
    }

    actual fun recordError(error: Any, map: Map<Any?, Any>?) {
        cocoapods.NewRelicAgent.NewRelic.recordError(error as NSError, map)
    }

    actual fun recordCustomEvent(eventType: String!, attributes:[NSObject : AnyObject]!) -> Bool {
        cocoapods.NewRelicAgent.NewRelic.recordCustomEvent(eventType, attributes)
    }

    actual fun recordCustomEvent(eventType: String!, name: String!, attributes:[NSObject : AnyObject]!) -> Bool {
        cocoapods.NewRelicAgent.NewRelic.recordCustomEvent(eventType, name, attributes)
    }

    actual fun recordMetric(withName: String!, category: String!, value: NSNumber!) {
        cocoapods.NewRelicAgent.NewRelic.recordMetric(withName: String!, category: String!, value: NSNumber!)
    }

    actual fun setAttribute(name: String, value: Double) {
        cocoapods.NewRelicAgent.NewRelic.setAttribute(name, value)
    }

    actual fun removeAttribute(name: String) {
        cocoapods.NewRelicAgent.NewRelic.removeAttribute(name)
    }

    actual fun removeAllAttributes() {
        cocoapods.NewRelicAgent.NewRelic.removeAllAttributes()
    }

    actual fun incrementAttribute(name: String, value : Double) {
        cocoapods.NewRelicAgent.NewRelic.incrementAttribute(name, NSNumber(value))
    }

    actual fun setUserId(userId: String) {
        cocoapods.NewRelicAgent.NewRelic.setUserId(userId)
    }

    actual fun setMaxEventBufferTime(maxBufferTimeInSec: Int) {
        cocoapods.NewRelicAgent.NewRelic.setMaxEventBufferTime(maxBufferTimeInSec.toUInt())
    }

    actual fun setMaxEventPoolSize(maxSize: Int) {
        cocoapods.NewRelicAgent.NewRelic.setMaxEventPoolSize(maxSize.toUInt())
    }

    actual fun withApplicationBuild(buildId: String) {
        cocoapods.NewRelicAgent.NewRelic.setApplicationBuild(buildId)
    }

    actual fun withApplicationVersion(appVersion: String?) {
        cocoapods.NewRelicAgent.NewRelic.withApplicationVersion(appVersion)
    }

    actual fun shutdown() {
        cocoapods.NewRelicAgent.NewRelic.shutdown()
    }

    actual fun crashNow(message: String) {
        cocoapods.NewRelicAgent.NewRelic.crashNow(message)
    }

    actual fun noticeHttpTransaction(url: String?, httpMethod: String?, statusCode: Int, startTimeMs: Long, endTimeMs: Long, bytesSent: Long, bytesReceived: Long, responseBody: String?) {
        cocoapods.NewRelicAgent.NewRelic.noticeNetworkRequest(url, httpMethod, statusCode, startTimeMs, endTimeMs, bytesSent, bytesReceived, responseBody)
    }

    actual fun noticeNetworkFailure(url: String?, httpMethod: String?, startTime: Long, endTime: Long, failure: NetworkFailure?) {
        cocoapods.NewRelicAgent.NewRelic.noticeNetworkFailure(url, httpMethod, startTime, failure)
    }

    actual fun addHTTPHeadersTrackingFor(headers: List<String>) {
        cocoapods.NewRelicAgent.NewRelic.addHTTPHeaderTracking(headers)
    }

    actual fun  noticeHttpTransaction(String url, String httpMethod, int statusCode, long startTimeMs, long endTimeMs, long bytesSent, long bytesReceived, String responseBody, Map<String, String> params, URLConnection urlConnection)

    actual companion object {
        actual fun withApplicationToken(token: String): NewRelic {
            val newRelic = cocoapods.NewRelicAgent.NewRelic.new()!!
            cocoapods.NewRelicAgent.NewRelic.startWithApplicationToken(token)
            return NewRelic(newRelic)
        }
    }



}

fun Throwable.asNSException() = NSException.exceptionWithName(this::class.qualifiedName, this.message, null)
