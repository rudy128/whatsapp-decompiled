package X;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.whatsapp.Me;

/* renamed from: X.1Ur  reason: invalid class name and case insensitive filesystem */
public class C27091Ur {
    public static final String[] A09 = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
    public boolean A00;
    public final AnonymousClass1RB A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass118 A04;
    public final AnonymousClass11C A05;
    public final C19830z4 A06;
    public final C18030ve A07;
    public volatile Boolean A08;

    public static boolean A01(Location location, Location location2) {
        return location2 == null || location2.getTime() + 120000 < location.getTime() || location2.getAccuracy() > location.getAccuracy() || (TextUtils.equals(location2.getProvider(), location.getProvider()) && location2.distanceTo(location) > Math.max(10.0f, location.getAccuracy()));
    }

    public static void A00(AnonymousClass8TE r4, C60072nL r5, Integer num) {
        double d = r5.A00;
        r4.A0E();
        C165968c8 r3 = (C165968c8) r4.A00;
        C165968c8 r0 = C165968c8.DEFAULT_INSTANCE;
        r3.bitField0_ |= 1;
        r3.degreesLatitude_ = d;
        double d2 = r5.A01;
        r4.A0E();
        C165968c8 r32 = (C165968c8) r4.A00;
        r32.bitField0_ |= 2;
        r32.degreesLongitude_ = d2;
        int i = r5.A03;
        if (i != -1) {
            r4.A0E();
            C165968c8 r1 = (C165968c8) r4.A00;
            r1.bitField0_ |= 4;
            r1.accuracyInMeters_ = i;
        }
        float f = r5.A02;
        if (f != -1.0f) {
            r4.A0E();
            C165968c8 r12 = (C165968c8) r4.A00;
            r12.bitField0_ |= 8;
            r12.speedInMps_ = f;
        }
        int i2 = r5.A04;
        if (i2 != -1) {
            r4.A0E();
            C165968c8 r13 = (C165968c8) r4.A00;
            r13.bitField0_ |= 16;
            r13.degreesClockwiseFromMagneticNorth_ = i2;
        }
        if (num != null) {
            int intValue = num.intValue();
            r4.A0E();
            C165968c8 r14 = (C165968c8) r4.A00;
            r14.bitField0_ |= 128;
            r14.timeOffset_ = intValue;
        }
    }

    public String A03() {
        AnonymousClass11S r0 = this.A02;
        r0.A0I();
        Me me = r0.A00;
        if (me == null) {
            return "ZZ";
        }
        return AnonymousClass1K3.A01(me.cc, me.number);
    }

    public void A05(Context context) {
        if (CEQ.A00 == null) {
            CEQ.A00 = new DAH(this.A01);
        }
        C26101CsL.A01(context, C197569wu.A0C);
        C8A.A00(context);
    }

    public boolean A06(Context context) {
        boolean z;
        if (this.A08 == null) {
            synchronized (this) {
                if (this.A08 != null) {
                    z = this.A08.booleanValue();
                } else {
                    z = false;
                    if (C41371wF.A00(context) == 0) {
                        z = true;
                    }
                }
            }
            this.A08 = Boolean.valueOf(z);
        }
        return this.A08.booleanValue();
    }

    public C27091Ur(AnonymousClass1RB r1, AnonymousClass11S r2, AnonymousClass11C r3, AnonymousClass11P r4, AnonymousClass118 r5, C19830z4 r6, C18030ve r7) {
        this.A03 = r4;
        this.A07 = r7;
        this.A04 = r5;
        this.A02 = r2;
        this.A05 = r3;
        this.A06 = r6;
        this.A01 = r1;
    }

    public C166418cr A02(C60072nL r3, Integer num) {
        AnonymousClass8X8 A002 = C166418cr.A00();
        C165968c8 r0 = ((C166418cr) A002.A00).liveLocationMessage_;
        if (r0 == null) {
            r0 = C165968c8.DEFAULT_INSTANCE;
        }
        AnonymousClass8TE r02 = (AnonymousClass8TE) r0.A0O();
        A00(r02, r3, num);
        A002.A0M(r02);
        return (C166418cr) A002.A0C();
    }

    public void A04(Context context) {
        String A032 = A03();
        if (!AnonymousClass026.A00(C26101CsL.A03, A032)) {
            C26101CsL.A00 = 0;
        }
        C26101CsL.A03 = A032;
        if (CEQ.A00 == null) {
            CEQ.A00 = new DAH(this.A01);
        }
        C26101CsL.A01(context, C197569wu.A0C);
        C26101CsL.A02(false);
        C8A.A00(context);
    }
}
