package com.google.android.gms.vision.clearcut;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.BEA;
import X.C23088Bb3;
import X.C23469BhY;
import X.C23471Bhb;
import X.C23475Bhf;
import X.C23477Bhh;
import X.C23478Bhi;
import X.C23483Bhn;
import X.C27294DbN;
import X.C41401wK;
import X.C41411wL;
import X.CBL;
import X.DK6;
import X.EE8;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.List;

public class LogUtils {
    public static String zzb(Context context) {
        try {
            C41411wL A00 = C41401wK.A00(context);
            return A00.A00.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Object[] A1a = AnonymousClass3MW.A1a();
            A1a[0] = context.getPackageName();
            CBL.A00("Unable to find calling package info for %s", e, A1a);
            return null;
        }
    }

    public static C23478Bhi zza(long j, int i, String str, String str2, List list, C23088Bb3 bb3) {
        C23469BhY bhY = (C23469BhY) C23475Bhf.zzg.A06(5);
        C23469BhY bhY2 = (C23469BhY) C23483Bhn.zzl.A06(5);
        C23469BhY.A00(bhY2);
        C23483Bhn bhn = (C23483Bhn) bhY2.A00;
        str2.getClass();
        bhn.zzc |= 1;
        bhn.zzd = str2;
        C23469BhY.A00(bhY2);
        C23483Bhn bhn2 = (C23483Bhn) bhY2.A00;
        int i2 = bhn2.zzc | 16;
        bhn2.zzc = i2;
        bhn2.zzi = j;
        bhn2.zzc = i2 | 32;
        bhn2.zzj = (long) i;
        EE8 ee8 = bhn2.zzk;
        if (!((C27294DbN) ee8).A00) {
            ee8 = ee8.CSz(BEA.A0C(ee8));
            bhn2.zzk = ee8;
        }
        DK6.A07(list, ee8);
        ArrayList A13 = AnonymousClass000.A13();
        A13.add(bhY2.A01());
        C23469BhY.A00(bhY);
        C23475Bhf bhf = (C23475Bhf) bhY.A00;
        EE8 ee82 = bhf.zzf;
        if (!((C27294DbN) ee82).A00) {
            ee82 = ee82.CSz(BEA.A0C(ee82));
            bhf.zzf = ee82;
        }
        DK6.A07(A13, ee82);
        C23469BhY bhY3 = (C23469BhY) C23477Bhh.zzi.A06(5);
        C23469BhY.A00(bhY3);
        C23477Bhh bhh = (C23477Bhh) bhY3.A00;
        int i3 = bhh.zzc | 4;
        bhh.zzc = i3;
        bhh.zzf = (long) bb3.A01;
        int i4 = i3 | 2;
        bhh.zzc = i4;
        bhh.zze = (long) bb3.A00;
        long j2 = (long) bb3.A02;
        int i5 = i4 | 8;
        bhh.zzc = i5;
        bhh.zzg = j2;
        long j3 = bb3.A04;
        bhh.zzc = i5 | 16;
        bhh.zzh = j3;
        C23477Bhh bhh2 = (C23477Bhh) bhY3.A01();
        C23469BhY.A00(bhY);
        C23475Bhf bhf2 = (C23475Bhf) bhY.A00;
        bhh2.getClass();
        bhf2.zzd = bhh2;
        bhf2.zzc |= 1;
        C23475Bhf bhf3 = (C23475Bhf) bhY.A01();
        C23469BhY bhY4 = (C23469BhY) C23478Bhi.zzi.A06(5);
        C23469BhY.A00(bhY4);
        C23478Bhi bhi = (C23478Bhi) bhY4.A00;
        bhf3.getClass();
        bhi.zzf = bhf3;
        bhi.zzc |= 4;
        return (C23478Bhi) bhY4.A01();
    }

    public static C23471Bhb zza(Context context) {
        C23469BhY bhY = (C23469BhY) C23471Bhb.zzf.A06(5);
        String packageName = context.getPackageName();
        C23469BhY.A00(bhY);
        C23471Bhb bhb = (C23471Bhb) bhY.A00;
        packageName.getClass();
        bhb.zzc |= 1;
        bhb.zzd = packageName;
        String zzb = zzb(context);
        if (zzb != null) {
            C23469BhY.A00(bhY);
            C23471Bhb bhb2 = (C23471Bhb) bhY.A00;
            bhb2.zzc |= 2;
            bhb2.zze = zzb;
        }
        return (C23471Bhb) bhY.A01();
    }
}
