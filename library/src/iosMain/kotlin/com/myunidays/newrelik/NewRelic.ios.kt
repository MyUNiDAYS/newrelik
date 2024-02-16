package com.myunidays.newrelik

import platform.Foundation.NSError
import platform.Foundation.NSException
import platform.Foundation.NSNumber
import platform.Foundation.numberWithDouble

actual class NewRelic internal constructor(val ios: cocoapods.NewRelicAgent.NewRelic) {
    actual fun start(context: Context) {
        // not used for ios as start happens when we set the token.
    }

    actual fun disableFeature(featureFlag: FeatureFlag) {
        cocoapods.NewRelicAgent.NewRelic.disableFeatures(featureFlag.ios)
    }

    actual fun enableFeature(featureFlag: FeatureFlag) {
        cocoapods.NewRelicAgent.NewRelic.enableFeatures(featureFlag.ios)
    }

    actual fun setInteractionName(name: String?) {
    }

    actual fun startInteraction(actionName: String) {
        cocoapods.NewRelicAgent.NewRelic.startInteractionWithName(actionName)
    }

    actual fun startInteraction(
        activityContext: Context,
        actionName: String
    ) {
        cocoapods.NewRelicAgent.NewRelic.startInteractionWithName(actionName)
    }

    actual fun endInteraction(id: String) {
        cocoapods.NewRelicAgent.NewRelic.stopCurrentInteraction(id)
    }

    actual fun currentSessionId() : String? = cocoapods.NewRelicAgent.NewRelic.currentSessionId()

    actual fun recordBreadcrumb(
        breadcrumbName: String,
        attributes: MutableMap<Any?, Any?>?
    ): Boolean = cocoapods.NewRelicAgent.NewRelic.recordBreadcrumb(breadcrumbName, attributes)

    actual fun recordHandledException(throwable: Throwable) {
        cocoapods.NewRelicAgent.NewRelic.recordHandledException(throwable.asNSException())
    }

    actual fun recordHandledException(
        exception: Exception,
        exceptionAttributes: Map<Any?, Any?>?
    ) {
        cocoapods.NewRelicAgent.NewRelic.recordHandledException(exception.asNSException(), exceptionAttributes)
    }

    actual fun recordHandledException(
        throwable: Throwable,
        attributes: Map<Any?, Any?>?
    ) {
        cocoapods.NewRelicAgent.NewRelic.recordHandledException(throwable.asNSException(), attributes)
    }

    // Need to have an expect actual for error.
    actual fun recordError(
        error: Any,
        map: Map<Any?, Any>?
    ) {
        cocoapods.NewRelicAgent.NewRelic.recordError(error as NSError, map)
    }

    actual fun recordCustomEvent(
        eventType: String,
        eventName: String?,
        eventAttributes: MutableMap<Any?, Any?>?
    ): Boolean = cocoapods.NewRelicAgent.NewRelic.recordCustomEvent(eventType, eventName, eventAttributes)

    actual fun recordCustomEvent(
        eventType: String,
        eventAttributes: Map<Any?, Any?>?
    ): Boolean = cocoapods.NewRelicAgent.NewRelic.recordCustomEvent(eventType, eventAttributes)

    actual fun recordMetric(
        name: String,
        category: String,
        count: Int,
        totalValue: Double,
        exclusiveValue: Double,
        countUnit: MetricUnit,
        valueUnit: MetricUnit
    ) {
//        cocoapods.NewRelicAgent.NewRelic.recordMetricWithName(name, category, NSNumber.numberWithDouble(totalValue), valueUnit, countUnit)
    }

    actual fun recordMetric(name: String, category: String, value: Double) {
        cocoapods.NewRelicAgent.NewRelic.recordMetricWithName(name, category, NSNumber.numberWithDouble(value))
    }

    actual fun recordMetric(name: String, category: String) {
        cocoapods.NewRelicAgent.NewRelic.recordMetricWithName(name, category)
    }

    actual fun removeAllAttributes() {
        cocoapods.NewRelicAgent.NewRelic.removeAllAttributes()
    }

    actual fun incrementAttribute(name: String, value : Double) {
        cocoapods.NewRelicAgent.NewRelic.incrementAttribute(name, NSNumber(value))
    }

    actual fun setMaxEventBufferTime(maxBufferTimeInSec: Int) {
        cocoapods.NewRelicAgent.NewRelic.setMaxEventBufferTime(maxBufferTimeInSec.toUInt())
    }

    actual fun setMaxEventPoolSize(maxSize: Int) {
        cocoapods.NewRelicAgent.NewRelic.setMaxEventPoolSize(maxSize.toUInt())
    }
    actual fun shutdown() {
        cocoapods.NewRelicAgent.NewRelic.shutdown()
    }

    actual fun crashNow(message: String) {
        cocoapods.NewRelicAgent.NewRelic.crashNow(message)
    }

    actual fun setAttribute(name: String?, value: String?) {
    }

    actual fun setAttribute(name: String?, value: Double) {
    }

    actual fun setAttribute(name: String?, value: Boolean) {
    }

    actual fun removeAttribute(name: String?) {
    }

    actual fun incrementAttribute(name: String) {
    }
    actual fun setUserId(userId: String?) {
    }

    actual fun withApplicationBuild(buildId: String?) {
    }

    actual fun withApplicationVersion(appVersion: String?) {
    }

    actual fun crashNow() {
    }

    actual fun noticeHttpTransaction(
        url: String?,
        httpMethod: String?,
        statusCode: Int,
        startTimeMs: Long,
        endTimeMs: Long,
        bytesSent: Long,
        bytesReceived: Long
    ) {
    }

    actual fun noticeHttpTransaction(
        url: String?,
        httpMethod: String?,
        statusCode: Int,
        startTimeMs: Long,
        endTimeMs: Long,
        bytesSent: Long,
        bytesReceived: Long,
        responseBody: String?
    ) {
    }

    actual fun noticeHttpTransaction(
        url: String?,
        httpMethod: String?,
        statusCode: Int,
        startTimeMs: Long,
        endTimeMs: Long,
        bytesSent: Long,
        bytesReceived: Long,
        responseBody: String?,
        params: Map<String?, String?>?
    ) {
    }

    actual fun noticeHttpTransaction(
        url: String?,
        httpMethod: String?,
        statusCode: Int,
        startTimeMs: Long,
        endTimeMs: Long,
        bytesSent: Long,
        bytesReceived: Long,
        responseBody: String?,
        params: Map<String?, String?>?,
        appData: String?
    ) {
    }

    actual fun noticeHttpTransaction(
        url: String?,
        httpMethod: String?,
        statusCode: Int,
        startTimeMs: Long,
        endTimeMs: Long,
        bytesSent: Long,
        bytesReceived: Long,
        responseBody: String?,
        params: Map<String?, String?>?,
        urlConnection: URLConnection?
    ) {
    }

    actual fun noticeHttpTransaction(
        url: String,
        httpMethod: String?,
        statusCode: Int,
        startTimeMs: Long,
        endTimeMs: Long,
        bytesSent: Long,
        bytesReceived: Long,
        responseBody: String?,
        params: Map<String?, String?>?,
        appData: String?,
        traceAttributes: Map<String?, Any?>?
    ) {
    }

    actual fun noticeNetworkFailure(
        url: String?,
        httpMethod: String?,
        startTime: Long,
        endTime: Long,
        failure: NetworkFailure,
        message: String?
    ) {
    }

    actual fun noticeNetworkFailure(
        url: String?,
        httpMethod: String?,
        startTime: Long,
        endTime: Long,
        failure: NetworkFailure
    ) {
    }

    actual fun noticeNetworkFailure(
        url: String?,
        httpMethod: String?,
        startTime: Long,
        endTime: Long,
        e: Exception
    ) {
    }

    @Deprecated("")
    actual fun noticeNetworkFailure(
        url: String?,
        startTime: Long,
        endTime: Long,
        failure: NetworkFailure?
    ) {
    }

    @Deprecated("")
    actual fun noticeNetworkFailure(
        url: String?,
        startTime: Long,
        endTime: Long,
        e: Exception?
    ) {
    }

    actual fun noticeNetworkFailure(
        url: String?,
        httpMethod: String?,
        startTimeMs: Long,
        endTimeMs: Long,
        failure: NetworkFailure,
        message: String?,
        traceAttributes: Map<String?, Any?>?
    ) {
    }

    actual fun noticeDistributedTrace(requestAttributes: Map<String?, String?>?): TraceContext {
        TODO("Not yet implemented")
    }

    actual fun addHTTPHeadersTrackingFor(headers: List<String>) {
    }

    actual fun withLaunchActivityName(className: String?) {
    }

    actual fun usingCollectorAddress(address: String) {
    }

    actual fun usingCrashCollectorAddress(address: String) {
    }

    actual fun withLoggingEnabled(enabled: Boolean) {
    }

    actual fun withLogLevel(level: Int) {
    }

    actual fun withApplicationFramework(
        applicationFramework: ApplicationFramework,
        frameworkVersion: String
    ) {
    }

    actual fun withCrashReportingEnabled(enabled: Boolean) {
    }

    actual fun withDistributedTraceListener(listener: TraceListener) {
    }

    actual fun withDeviceID(deviceId: String) {
    }

    actual fun isStarted() {
    }

    actual fun startMethodTrace(actionName: String) {
    }

    actual fun endMethodTrace() {
    }

    actual fun recordHandledException(exception: Exception): Boolean {
        TODO("Not yet implemented")
    }

    actual fun addHTTPHeadersTrackingFor(headers: List<String?>?): Boolean {
        TODO("Not yet implemented")
    }

    actual fun setEventListener(eventListener: EventListener?) {
    }

    actual fun recordJSErrorException(stackTrace: StackTrace?): Boolean {
        TODO("Not yet implemented")
    }

    actual companion object {
        actual fun withApplicationToken(token: String): NewRelic {
            val newRelic = cocoapods.NewRelicAgent.NewRelic.new()!!
            cocoapods.NewRelicAgent.NewRelic.startWithApplicationToken(token)
            return NewRelic(newRelic)
        }
    }
}

fun Throwable.asNSException() = NSException.exceptionWithName(this::class.qualifiedName, this.message, null)
