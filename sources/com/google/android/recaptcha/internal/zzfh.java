package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass3MW;
import X.BE6;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class zzfh {
    public final zzfk zza = zzfk.zza;
    public boolean zzb;
    public long zzc;
    public long zzd;

    public static zzfh zzc() {
        return new zzfh();
    }

    public final zzfh zzd() {
        this.zzc = 0;
        this.zzb = false;
        return this;
    }

    public static zzfh zzb() {
        zzfh zzfh = new zzfh();
        zzfh.zze();
        return zzfh;
    }

    private final long zzg() {
        if (this.zzb) {
            return (System.nanoTime() - this.zzd) + this.zzc;
        }
        return this.zzc;
    }

    public final zzfh zze() {
        zzff.zze(!this.zzb, "This stopwatch is already running.");
        this.zzb = true;
        this.zzd = System.nanoTime();
        return this;
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long zzg = zzg();
        if (BE6.A0N(zzg, TimeUnit.DAYS) > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (BE6.A0N(zzg, TimeUnit.HOURS) > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (BE6.A0N(zzg, TimeUnit.MINUTES) > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (BE6.A0N(zzg, TimeUnit.SECONDS) > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (BE6.A0N(zzg, TimeUnit.MILLISECONDS) > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (BE6.A0N(zzg, TimeUnit.MICROSECONDS) > 0) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        double d = (double) zzg;
        double convert = (double) TimeUnit.NANOSECONDS.convert(1, timeUnit);
        Locale locale = Locale.ROOT;
        Object[] A1a = AnonymousClass3MW.A1a();
        A1a[0] = Double.valueOf(d / convert);
        String format = String.format(locale, "%.4g", A1a);
        switch (BE6.A0E(timeUnit, zzfg.zza)) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return AnonymousClass001.A1H(" ", str, AnonymousClass000.A11(format));
    }

    public final long zza(TimeUnit timeUnit) {
        return BE6.A0N(zzg(), timeUnit);
    }

    public final zzfh zzf() {
        long nanoTime = System.nanoTime();
        zzff.zze(this.zzb, "This stopwatch is already stopped.");
        this.zzb = false;
        this.zzc += nanoTime - this.zzd;
        return this;
    }
}
