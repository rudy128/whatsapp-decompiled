package com.google.android.gms.flags.impl;

import X.BE9;
import X.C22599BFf;
import X.C23228Bde;
import X.C24451C4q;
import X.C27116DVa;
import X.C27117DVc;
import X.DVR;
import X.DVZ;
import X.DVb;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.IInterface;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Callable;

public class FlagProviderImpl extends C22599BFf implements IInterface {
    public SharedPreferences A00;
    public boolean A01;

    public FlagProviderImpl(int i) {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
    }

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        Boolean bool;
        if (!this.A01) {
            return z;
        }
        SharedPreferences sharedPreferences = this.A00;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            bool = (Boolean) A00(new DVZ(sharedPreferences, valueOf, str));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", BE9.A0o("Flag value not available, returning default: ", valueOf2, valueOf2.length()));
            bool = valueOf;
        }
        return bool.booleanValue();
    }

    public int getIntFlagValue(String str, int i, int i2) {
        Integer num;
        if (!this.A01) {
            return i;
        }
        SharedPreferences sharedPreferences = this.A00;
        Integer valueOf = Integer.valueOf(i);
        try {
            num = (Integer) A00(new C27116DVa(sharedPreferences, valueOf, str));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", BE9.A0o("Flag value not available, returning default: ", valueOf2, valueOf2.length()));
            num = valueOf;
        }
        return num.intValue();
    }

    public long getLongFlagValue(String str, long j, int i) {
        Long l;
        if (!this.A01) {
            return j;
        }
        SharedPreferences sharedPreferences = this.A00;
        Long valueOf = Long.valueOf(j);
        try {
            l = (Long) A00(new DVb(sharedPreferences, valueOf, str));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", BE9.A0o("Flag value not available, returning default: ", valueOf2, valueOf2.length()));
            l = valueOf;
        }
        return l.longValue();
    }

    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.A01) {
            return str2;
        }
        try {
            return (String) A00(new C27117DVc(this.A00, str, str2));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", BE9.A0o("Flag value not available, returning default: ", valueOf, valueOf.length()));
            return str2;
        }
    }

    /* JADX INFO: finally extract failed */
    public static Object A00(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            Object call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    public void init(IObjectWrapper iObjectWrapper) {
        SharedPreferences sharedPreferences;
        Context context = (Context) C23228Bde.A00(iObjectWrapper);
        if (!this.A01) {
            try {
                Context createPackageContext = context.createPackageContext("com.google.android.gms", 0);
                synchronized (SharedPreferences.class) {
                    sharedPreferences = C24451C4q.A00;
                    if (sharedPreferences == null) {
                        sharedPreferences = (SharedPreferences) A00(new DVR(createPackageContext));
                        C24451C4q.A00 = sharedPreferences;
                    }
                }
                this.A00 = sharedPreferences;
                this.A01 = true;
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.w("FlagProviderImpl", BE9.A0o("Could not retrieve sdk flags, continuing with defaults: ", valueOf, valueOf.length()));
            }
        }
    }

    public FlagProviderImpl() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
        this.A01 = false;
    }
}
