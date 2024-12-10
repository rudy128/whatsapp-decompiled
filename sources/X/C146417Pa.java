package X;

import java.io.Serializable;
import java.text.DateFormat;

/* renamed from: X.7Pa  reason: invalid class name and case insensitive filesystem */
public class C146417Pa implements Comparable, Serializable {
    public static final long serialVersionUID = 8139806907588338737L;
    public final long ntpTime;
    public DateFormat simpleFormatter;
    public DateFormat utcFormatter;

    public static long A00(long j) {
        long j2;
        long j3 = (j >>> 32) & 4294967295L;
        long round = Math.round((((double) (j & 4294967295L)) * 1000.0d) / 4.294967296E9d);
        if ((2147483648L & j3) == 0) {
            j2 = 2085978496000L;
        } else {
            j2 = -2208988800000L;
        }
        return (j3 * 1000) + j2 + round;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j = this.ntpTime;
        long j2 = ((C146417Pa) obj).ntpTime;
        if (j < j2) {
            return -1;
        }
        if (j == j2) {
            return 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C146417Pa) || this.ntpTime != ((C146417Pa) obj).ntpTime) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0I(this.ntpTime);
    }

    public String toString() {
        long j = this.ntpTime;
        StringBuilder A10 = AnonymousClass000.A10();
        String hexString = Long.toHexString((j >>> 32) & 4294967295L);
        for (int length = hexString.length(); length < 8; length++) {
            A10.append('0');
        }
        A10.append(hexString);
        A10.append('.');
        String hexString2 = Long.toHexString(j & 4294967295L);
        for (int length2 = hexString2.length(); length2 < 8; length2++) {
            A10.append('0');
        }
        return AnonymousClass000.A0y(hexString2, A10);
    }

    public C146417Pa(long j) {
        this.ntpTime = j;
    }
}
