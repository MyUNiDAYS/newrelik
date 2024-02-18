package com.myunidays.newrelik

@Suppress("TooManyFunctions")
expect class NewRelic {

    fun start(context: Context) // going to need to pass in a context here for android

// ios Context = UIApplication in UIKit
    // android use application
    fun disableFeature(featureFlag: FeatureFlag)

    fun enableFeature(featureFlag: FeatureFlag)

    fun setInteractionName(name: String?)

    fun startInteraction(actionName: String)

    fun startInteraction(activityContext: Context, actionName: String)

    fun endInteraction(id: String)

    fun currentSessionId(): String?

    fun recordBreadcrumb(breadcrumbName: String, attributes: MutableMap<Any?, Any?>?): Boolean

    fun recordHandledException(throwable: Throwable)

    fun recordHandledException(exception: Exception): Boolean

    fun recordHandledException(exception: Exception, exceptionAttributes: Map<Any?, Any?>?)

    fun recordHandledException(throwable: Throwable, attributes: Map<Any?, Any?>?)

    fun recordError(error: Any, map: Map<Any?, Any>?)

    fun recordCustomEvent(eventType: String, eventName: String?, eventAttributes: MutableMap<Any?, Any?>?): Boolean

    fun recordCustomEvent(eventType: String, eventAttributes: Map<Any?, Any?>?): Boolean

    @Suppress("LongParameterList")
    fun recordMetric(
        name: String,
        category: String,
        count: Int,
        totalValue: Double,
        exclusiveValue: Double,
        countUnit: MetricUnit,
        valueUnit: MetricUnit
    )

    // some of these can be merged into one with optionals.
    fun recordMetric(name: String, category: String, value: Double)

    fun recordMetric(name: String, category: String)

    fun setAttribute(name: String, value: String)

    fun setAttribute(name: String, value: Double)

    fun setAttribute(name: String, value: Boolean)

    fun removeAttribute(name: String)

    fun removeAllAttributes()

    fun incrementAttribute(name: String)

    fun incrementAttribute(name: String, value: Double)

    fun setUserId(userId: String)

    fun setMaxEventBufferTime(maxBufferTimeInSec: Int)

    fun setMaxEventPoolSize(maxSize: Int)

    fun withApplicationBuild(buildId: String)

    fun withApplicationVersion(appVersion: String)

    fun shutdown()

    fun crashNow()

    fun crashNow(message: String)

    @Suppress("LongParameterList")
    fun noticeHttpTransaction(
        url: String,
        httpMethod: String?,
        statusCode: Int,
        startTimeMs: Long,
        endTimeMs: Long,
        bytesSent: Long,
        bytesReceived: Long
    )

    @Suppress("LongParameterList")
    fun noticeHttpTransaction(
        url: String,
        httpMethod: String?,
        statusCode: Int,
        startTimeMs: Long,
        endTimeMs: Long,
        bytesSent: Long,
        bytesReceived: Long,
        responseBody: String?
    )

    @Suppress("LongParameterList")
    fun noticeHttpTransaction(
        url: String,
        httpMethod: String?,
        statusCode: Int,
        startTimeMs: Long,
        endTimeMs: Long,
        bytesSent: Long,
        bytesReceived: Long,
        responseBody: String?,
        params: Map<String?, String?>?
    )

    @Suppress("LongParameterList")
    fun noticeHttpTransaction(
        url: String,
        httpMethod: String?,
        statusCode: Int,
        startTimeMs: Long,
        endTimeMs: Long,
        bytesSent: Long,
        bytesReceived: Long,
        responseBody: String?,
        params: Map<String?, String?>?,
        appData: String?
    )

    @Suppress("LongParameterList")
    fun noticeHttpTransaction(
        url: String,
        httpMethod: String?,
        statusCode: Int,
        startTimeMs: Long,
        endTimeMs: Long,
        bytesSent: Long,
        bytesReceived: Long,
        responseBody: String?,
        params: Map<String?, String?>?,
        urlConnection: URLConnection?
    )

    @Suppress("LongParameterList")
    fun noticeHttpTransaction(
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
    )

    @Suppress("LongParameterList")
    fun noticeNetworkFailure(
        url: String,
        httpMethod: String?,
        startTime: Long,
        endTime: Long,
        failure: NetworkFailure,
        message: String?
    )

    fun noticeNetworkFailure(url: String, httpMethod: String?, startTime: Long, endTime: Long, failure: NetworkFailure)

    fun noticeNetworkFailure(url: String, httpMethod: String?, startTime: Long, endTime: Long, e: Exception)

    @Deprecated("")
    fun noticeNetworkFailure(url: String, startTime: Long, endTime: Long, failure: NetworkFailure?)

    @Deprecated("")
    fun noticeNetworkFailure(url: String, startTime: Long, endTime: Long, e: Exception?)

    @Suppress("LongParameterList")
    fun noticeNetworkFailure(
        url: String,
        httpMethod: String?,
        startTimeMs: Long,
        endTimeMs: Long,
        failure: NetworkFailure,
        message: String?,
        traceAttributes: Map<String?, Any?>?
    )

    fun noticeDistributedTrace(requestAttributes: Map<String?, String?>?): TraceContext

    fun addHTTPHeadersTrackingFor(headers: List<String>)

    fun withLaunchActivityName(className: String?)

    fun usingCollectorAddress(address: String)

    fun usingCrashCollectorAddress(address: String)

    fun withLoggingEnabled(enabled: Boolean)

    fun withLogLevel(level: Int)

    fun withApplicationFramework(applicationFramework: ApplicationFramework, frameworkVersion: String)

    fun withCrashReportingEnabled(enabled: Boolean)

    fun withDistributedTraceListener(listener: TraceListener)

    fun withDeviceID(deviceId: String)

    fun isStarted()

    fun startMethodTrace(actionName: String)

    fun endMethodTrace()

    fun setEventListener(eventListener: EventListener?)

    fun recordJSErrorException(stackTrace: StackTrace?): Boolean

    fun addHTTPHeadersTrackingFor(headers: List<String?>?): Boolean

    companion object {
        fun withApplicationToken(token: String): NewRelic
    }
}
