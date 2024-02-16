package com.myunidays.newrelik

import android.content.Context


actual class NewRelic internal constructor(private val android: com.newrelic.agent.android.NewRelic){

    actual fun start(context: Context) {
        android.start(context)
    }

    actual fun disableFeature(featureFlag: FeatureFlag) {
        com.newrelic.agent.android.NewRelic.disableFeature(featureFlag.android)
    }

    actual fun enableFeature(featureFlag: FeatureFlag) {
        com.newrelic.agent.android.NewRelic.enableFeature(featureFlag.android)
    }

    actual fun setInteractionName(name: String?) {
        com.newrelic.agent.android.NewRelic.setInteractionName(name)
    }

    actual fun startInteraction(actionName: String) {
        com.newrelic.agent.android.NewRelic.startInteraction(actionName)
    }

    actual fun startInteraction(activityContext: Context, actionName: String) {
        com.newrelic.agent.android.NewRelic.startInteraction(activityContext, actionName)
    }

    actual fun endInteraction(id: String) {
        com.newrelic.agent.android.NewRelic.endInteraction(id)
    }

    actual fun currentSessionId() {
        com.newrelic.agent.android.NewRelic.currentSessionId()
    }

    actual fun recordBreadcrumb(breadcrumbName: String?, attributes: Map<String?, Any?>?) {
        com.newrelic.agent.android.NewRelic.recordBreadcrumb(breadcrumbName, attributes)
    }

    actual fun recordBreadcrumb(breadcrumbName: String?, attributes: MutableMap<String?, Any?>?): Boolean {
        return com.newrelic.agent.android.NewRelic.recordBreadcrumb(breadcrumbName, attributes)
    }

    actual fun recordHandledException(throwable: Throwable?) {
        com.newrelic.agent.android.NewRelic.recordHandledException(throwable)
    }

    actual fun recordHandledException(exception: Exception?, exceptionAttributes: Map<String?, Any?>?) {
        com.newrelic.agent.android.NewRelic.recordHandledException(exception, exceptionAttributes)
    }

    actual fun recordHandledException(throwable: Throwable?, attributes: Map<String?, Any?>?) {
        com.newrelic.agent.android.NewRelic.recordHandledException(throwable, attributes)
    }

    // no recordError function for Android

    actual fun recordError(error: Any, map: Map<Any?, Any>?) {}

    actual fun recordCustomEvent(eventType: String?, eventName: String?, eventAttributes: MutableMap<String?, Any?>?) {
        com.newrelic.agent.android.NewRelic.recordCustomEvent(eventType, eventName, eventAttributes)
    }

    actual fun recordCustomEvent(eventType: String?, eventAttributes: Map<String?, Any?>?): Boolean {
        return com.newrelic.agent.android.NewRelic.recordCustomEvent(eventType, eventAttributes)
    }

    actual fun recordMetric(name: String, category: String, count: Int, totalValue: Double, exclusiveValue: Double, countUnit: MetricUnit, valueUnit: MetricUnit) {
        com.newrelic.agent.android.NewRelic.recordMetric(name, category, count, totalValue, exclusiveValue, countUnit.android, valueUnit.android)
    }

    actual fun recordMetric(name: String?, category: String?, value: Double) {
        com.newrelic.agent.android.NewRelic.recordMetric(name, category, value)
    }

    actual fun recordMetric(name: String?, category: String?) {
        com.newrelic.agent.android.NewRelic.recordMetric(name, category)
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

    actual fun removeAttribute(name: String?) {
        com.newrelic.agent.android.NewRelic.removeAttribute(name)
    }

    actual fun removeAllAttributes() {
        com.newrelic.agent.android.NewRelic.removeAllAttributes()
    }

    actual fun incrementAttribute(name: String) {
        com.newrelic.agent.android.NewRelic.incrementAttribute(name, 1.0)
    }

    actual fun incrementAttribute(name: String, value : Double) {
        com.newrelic.agent.android.NewRelic.incrementAttribute(name, value)
    }

    actual fun setUserId(userId: String?) {
        com.newrelic.agent.android.NewRelic.setUserId(userId)
    }

    actual fun setMaxEventBufferTime(maxBufferTimeInSec: Int) {
        com.newrelic.agent.android.NewRelic.setMaxEventBufferTime(maxBufferTimeInSec)
    }

    actual fun setMaxEventPoolSize(maxSize: Int) {
        com.newrelic.agent.android.NewRelic.setMaxEventPoolSize(maxSize)
    }

    actual fun withApplicationBuild(buildId: String?) {
        android.withApplicationBuild(buildId)
    }

    actual fun withApplicationVersion(appVersion: String?) {
        android.withApplicationVersion(appVersion)
    }

    actual fun shutdown() {
        com.newrelic.agent.android.NewRelic.shutdown()
    }

    actual fun crashNow() {
        com.newrelic.agent.android.NewRelic.crashNow()
    }

    actual fun crashNow(message: String) {
        com.newrelic.agent.android.NewRelic.crashNow(message)
    }

    actual fun noticeHttpTransaction(url: String?, httpMethod: String?, statusCode: Int, startTimeMs: Long, endTimeMs: Long, bytesSent: Long, bytesReceived: Long) {
        com.newrelic.agent.android.NewRelic.noticeHttpTransaction(url, httpMethod, statusCode, startTimeMs, endTimeMs, bytesSent, bytesReceived)
    }

    actual fun noticeHttpTransaction(url: String?, httpMethod: String?, statusCode: Int, startTimeMs: Long, endTimeMs: Long, bytesSent: Long, bytesReceived: Long, responseBody: String?) {
        com.newrelic.agent.android.NewRelic.noticeHttpTransaction(url, httpMethod, statusCode, startTimeMs, endTimeMs, bytesSent, bytesReceived, responseBody)
    }

    actual fun noticeHttpTransaction(url: String?, httpMethod: String?, statusCode: Int, startTimeMs: Long, endTimeMs: Long, bytesSent: Long, bytesReceived: Long, responseBody: String?, params: Map<String?, String?>?) {
        com.newrelic.agent.android.NewRelic.noticeHttpTransaction(url, httpMethod, statusCode, startTimeMs, endTimeMs, bytesSent, bytesReceived, responseBody, params)
    }

    actual fun noticeHttpTransaction(url: String?, httpMethod: String?, statusCode: Int, startTimeMs: Long, endTimeMs: Long, bytesSent: Long, bytesReceived: Long, responseBody: String?, params: Map<String?, String?>?, appData: String?) {
        com.newrelic.agent.android.NewRelic.noticeHttpTransaction(url, httpMethod, statusCode, startTimeMs, endTimeMs, bytesSent, bytesReceived, responseBody, params, appData)
    }

    actual fun noticeHttpTransaction(url: String?, httpMethod: String?, statusCode: Int, startTimeMs: Long, endTimeMs: Long, bytesSent: Long, bytesReceived: Long, responseBody: String?, params: Map<String?, String?>?, urlConnection: URLConnection?) {
        com.newrelic.agent.android.NewRelic.noticeHttpTransaction(url, httpMethod, statusCode, startTimeMs, endTimeMs, bytesSent, bytesReceived, responseBody, params, urlConnection?.android)
    }

    actual fun noticeHttpTransaction(url: String, httpMethod: String?, statusCode: Int, startTimeMs: Long, endTimeMs: Long, bytesSent: Long, bytesReceived: Long, responseBody: String?, params: Map<String?, String?>?, appData: String?, traceAttributes: Map<String?, Any?>?) {
        com.newrelic.agent.android.NewRelic.noticeHttpTransaction(url, httpMethod, statusCode, startTimeMs, endTimeMs, bytesSent, bytesReceived, responseBody, params, appData, traceAttributes)
    }

    actual fun noticeNetworkFailure(url: String?, httpMethod: String?, startTime: Long, endTime: Long, failure: NetworkFailure, message: String?) {
        com.newrelic.agent.android.NewRelic.noticeNetworkFailure(url, httpMethod, startTime, endTime, failure.android, message)
    }

    actual fun noticeNetworkFailure(url: String?, httpMethod: String?, startTime: Long, endTime: Long, failure: NetworkFailure) {
        com.newrelic.agent.android.NewRelic.noticeNetworkFailure(url, httpMethod, startTime, endTime, failure.android)
    }

    actual fun noticeNetworkFailure(url: String?, httpMethod: String?, startTime: Long, endTime: Long, e: Exception) {
        com.newrelic.agent.android.NewRelic.noticeNetworkFailure(url, httpMethod, startTime, endTime, e)
    }


    @Deprecated("")
    actual fun noticeNetworkFailure(url: String?, startTime: Long, endTime: Long, failure: com.myunidays.newrelik.NetworkFailure?) {
        com.newrelic.agent.android.NewRelic.noticeNetworkFailure(url, startTime, endTime, failure.android)
    }

    @Deprecated("")
    actual fun noticeNetworkFailure(url: String?, startTime: Long, endTime: Long, e: Exception?) {
        com.newrelic.agent.android.NewRelic.noticeNetworkFailure(url, startTime, endTime, e)
    }

    actual fun noticeNetworkFailure(url: String?, httpMethod: String?, startTimeMs: Long, endTimeMs: Long, failure: NetworkFailure, message: String?, traceAttributes: Map<String?, Any?>?) {
        com.newrelic.agent.android.NewRelic.noticeNetworkFailure(url, httpMethod, startTimeMs, endTimeMs, failure.android, message, traceAttributes)
    }

    actual fun noticeDistributedTrace(requestAttributes: Map<String?, String?>?): TraceContext {
        return TraceContext(com.newrelic.agent.android.NewRelic.noticeDistributedTrace(requestAttributes))
    }


    actual fun addHTTPHeadersTrackingFor(headers: List<String>) {
        com.newrelic.agent.android.NewRelic.addHTTPHeadersTrackingFor(headers)
    }

    actual fun withLaunchActivityName(className: String?) {
        android.withLaunchActivityName(className)
    }

    actual fun usingCollectorAddress(address: String) {
        android.usingCollectorAddress(address)
    }

    actual fun usingCrashCollectorAddress(address: String) {
        android.usingCrashCollectorAddress(address)
    }

    actual fun withLoggingEnabled(enabled: Boolean) {
        android.withLoggingEnabled(enabled)
    }

    actual fun withLogLevel(level: Int) {
        android.withLogLevel(level)
    }

    actual fun withApplicationFramework(applicationFramework: ApplicationFramework, frameworkVersion: String) {
        android.withApplicationFramework(applicationFramework.android, frameworkVersion)
    }

    actual fun withCrashReportingEnabled(enabled: Boolean) {
        android.withCrashReportingEnabled(enabled)
    }

    actual fun withDistributedTraceListener(listener: TraceListener) {
        android.withDistributedTraceListener(listener.android)
    }

    actual fun withDeviceID(deviceId: String) {
        android.withDeviceID(deviceId)
    }

    actual fun isStarted() {
        com.newrelic.agent.android.NewRelic.isStarted()
    }

    actual fun startMethodTrace(actionName: String) {
        com.newrelic.agent.android.NewRelic.startMethodTrace(actionName)
    }

    actual fun endMethodTrace() {
        com.newrelic.agent.android.NewRelic.endMethodTrace()
    }

    actual companion object {
        actual fun withApplicationToken(token: String): NewRelic =
            NewRelic(com.newrelic.agent.android.NewRelic.withApplicationToken(token))
    }
}
