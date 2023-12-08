package com.myunidays.newrelik

import com.newrelic.agent.android.FeatureFlag
import com.newrelic.agent.android.util.NetworkFailure

actual class NewRelic internal constructor(val android: com.newrelic.agent.android.NewRelic){

    actual fun start() {
//        android.start()

    }

    actual fun crashNow() {
        com.newrelic.agent.android.NewRelic.crashNow()
    }

    actual fun disableFeature(featureFlag: FeatureFlag) {
        com.newrelic.agent.android.NewRelic.disableFeature(featureFlag)
    }

    actual fun enableFeature(featureFlag: FeatureFlag) {
        com.newrelic.agent.android.NewRelic.enableFeature(featureFlag)
    }

    actual fun setInteractionName(name: String?) {
        com.newrelic.agent.android.NewRelic.setInteractionName(name)
    }

    actual fun startInteraction(actionName: String) {
        com.newrelic.agent.android.NewRelic.startInteraction(actionName)
    }

    actual fun endInteraction(id: String) {
        com.newrelic.agent.android.NewRelic.endInteraction(id)
    }

    actual fun currentSessionId() {
        com.newrelic.agent.android.NewRelic.currentSessionId()
    }

    actual fun recordBreadcrumb(breadcrumbName: String, attributes: Map<String?, Any?>) {
        com.newrelic.agent.android.NewRelic.recordBreadcrumb(breadcrumbName, attributes)
    }
    actual fun recordHandledException(exception: Exception?, exceptionAttributes: Map<String?, Any?>?) {
        com.newrelic.agent.android.NewRelic.recordHandledException(exception, exceptionAttributes)
    }

    actual fun recordHandledException(throwable: Throwable?) {
        com.newrelic.agent.android.NewRelic.recordHandledException(throwable)
    }

    actual fun recordHandledException(throwable: Throwable?, attributes: Map<String?, Any?>?) {
        com.newrelic.agent.android.NewRelic.recordHandledException(throwable, attributes)
    }

    // no recordError function for Android

    actual fun recordCustomEvent(eventType: String?, eventName: String?, eventAttributes: MutableMap<String?, Any?>?) {
        com.newrelic.agent.android.NewRelic.recordCustomEvent(eventType, eventName, eventAttributes)
    }

    actual fun recordMetric(name: String, category: String, count: Int, totalValue: Double, exclusiveValue: Double, countUnit: MetricUnit, valueUnit: MetricUnit) {
        com.newrelic.agent.android.NewRelic.recordMetric(name, category, count, totalValue, exclusiveValue, countUnit, valueUnit)
    }

    actual fun recordMetric(name: String?, category: String?, value: Double = 1.0) {
        com.newrelic.agent.android.NewRelic.recordMetric(name, category, value)
    }

    actual fun setAttribute(name: String?, value: String?) {
        com.newrelic.agent.android.NewRelic.setAttribute(name, value)
    }

    actual fun setAttribute(name: String?, value: Double) {
        com.newrelic.agent.android.NewRelic.setAttribute(name, value)
    }

    actual fun setAttribute(name: String?, value: Boolean) {
        com.newrelic.agent.android.NewRelic.setAttribute(name, value)
    }

    actual fun removeAttribute(name: String) {
        com.newrelic.agent.android.NewRelic.removeAttribute(name)
    }

    actual fun removeAllAttributes() {
        com.newrelic.agent.android.NewRelic.removeAllAttributes()
    }

    actual fun incrementAttribute(name: String, value : Double) {
        com.newrelic.agent.android.NewRelic.incrementAttribute(name, value)
    }

    actual fun setUserId(userId: String) {
        com.newrelic.agent.android.NewRelic.setUserId(userId)
    }

    actual fun setMaxEventBufferTime(maxBufferTimeInSec: Int) {
        com.newrelic.agent.android.NewRelic.setMaxEventBufferTime(maxBufferTimeInSec)
    }

    actual fun setMaxEventPoolSize(maxSize: Int) {
        com.newrelic.agent.android.NewRelic.setMaxEventPoolSize(maxSize)
    }

    actual fun withApplicationBuild(buildId: String) {
        com.newrelic.agent.android.NewRelic.withApplicationBuild(buildId)
    }

    actual fun withApplicationVersion(appVersion: String?) {
        com.newrelic.agent.android.NewRelic.withApplicationVersion(appVersion)
    }

    actual fun shutdown() {
        com.newrelic.agent.android.NewRelic.shutdown()
    }

    actual fun crashNow(message: String) {
        com.newrelic.agent.android.NewRelic.crashNow(message)
    }

    actual fun noticeHttpTransaction(url: String?, httpMethod: String?, statusCode: Int, startTimeMs: Long, endTimeMs: Long, bytesSent: Long, bytesReceived: Long, responseBody: String?) {
        com.newrelic.agent.android.NewRelic.noticeHttpTransaction(url, httpMethod, statusCode, startTimeMs, endTimeMs, bytesSent, bytesReceived, responseBody)
    }

    actual fun noticeNetworkFailure(url: String?, httpMethod: String?, startTime: Long, endTime: Long, failure: NetworkFailure?) {
        com.newrelic.agent.android.NewRelic.noticeNetworkFailure(url, httpMethod, startTime, endTime, failure)
    }

    actual fun addHTTPHeadersTrackingFor(headers: List<String>) {
        com.newrelic.agent.android.NewRelic.addHTTPHeadersTrackingFor(headers)
    }

    actual fun withLaunchActivityName(className: String?) {
        com.newrelic.agent.android.NewRelic.withLaunchActivityName(className)
    }

    actual companion object {
        actual fun withApplicationToken(token: String): NewRelic =
            NewRelic(com.newrelic.agent.android.NewRelic.withApplicationToken(token))
    }
}
