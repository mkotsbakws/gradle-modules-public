package no.vegvesen.saga.modules.shared

import kotlinx.datetime.toJavaInstant
import kotlinx.datetime.toKotlinInstant
import java.time.Instant
import java.time.OffsetDateTime
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal
import java.util.Locale
import javax.xml.datatype.XMLGregorianCalendar

val OsloZone: ZoneId = ZoneId.of("Europe/Oslo")

fun XMLGregorianCalendar?.toZonedDateTimeOrNull(): ZonedDateTime? {
    return this?.toGregorianCalendar()?.toZonedDateTime()
}

fun XMLGregorianCalendar.toZonedDateTime(): ZonedDateTime {
    return this.toGregorianCalendar().toZonedDateTime()
}

fun XMLGregorianCalendar.toOffsetDateTime(): OffsetDateTime {
    return this.toGregorianCalendar().toZonedDateTime().toOffsetDateTime()
}

fun XMLGregorianCalendar.toInstant(): Instant {
    return this.toGregorianCalendar().toInstant()
}

fun XMLGregorianCalendar.toKotlinInstant(): kotlinx.datetime.Instant {
    return this.toInstant().toKotlinInstant()
}

fun ZonedDateTime?.toIsoStringOrNull(): String? {
    return this?.toOffsetDateTime()?.toString()
}

fun String.toInstantFromHttpDateString(): Instant =
    ZonedDateTime.parse(this, httpDateFormat).toInstant()

fun Temporal.toHttpDateString(): String = httpDateFormat.format(this)

private val GreenwichMeanTime: ZoneId = ZoneId.of("GMT")

private val httpDateFormat: DateTimeFormatter = DateTimeFormatter
    .ofPattern("EEE, dd MMM yyyy HH:mm:ss z")
    .withLocale(Locale.US)
    .withZone(GreenwichMeanTime)!!

fun kotlinx.datetime.Instant.toHttpDateString(): String = this.toJavaInstant().toHttpDateString()
