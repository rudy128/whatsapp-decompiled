package com.whatsapp.notification;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass11C;
import X.AnonymousClass122;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass1NJ;
import X.AnonymousClass1W6;
import X.AnonymousClass206;
import X.AnonymousClass21V;
import X.AnonymousClass4aU;
import X.AnonymousClass73W;
import X.C000200d;
import X.C008503u;
import X.C129536hx;
import X.C137046up;
import X.C139316yd;
import X.C1408573i;
import X.C1409673t;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18000vb;
import X.C18010vc;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C21425Ajs;
import X.C21467AkY;
import X.C217217d;
import X.C22971Dz;
import X.C24921Me;
import X.C25260Cbz;
import X.C26302CxJ;
import X.C29681ch;
import X.C31221fD;
import X.C32291gx;
import X.C32791hl;
import X.C32951i1;
import X.C32991i5;
import X.C33251iW;
import X.C35681md;
import X.C438421d;
import X.C48592Nd;
import X.C54242dp;
import X.C60182nW;
import X.C62952sG;
import X.C70653Bz;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public final class AndroidWear extends C48592Nd {
    public static C25260Cbz A0B;
    public static final String A0C;
    public static final String A0D = AnonymousClass000.A0y(".intent.action.MUTE_NEWSLETTER", AnonymousClass000.A11("com.whatsapp"));
    public static final String A0E = AnonymousClass000.A0y(".intent.action.REACTION", AnonymousClass000.A11("com.whatsapp"));
    public static final String A0F = AnonymousClass000.A0y(".intent.action.REPLY", AnonymousClass000.A11("com.whatsapp"));
    public static final int[] A0G = {2131886664, 2131886659, 2131886661, 2131886660, 2131886662, 2131886656, 2131886657, 2131886658, 2131886655, 2131886663};
    public AnonymousClass1KB A00;
    public C33251iW A01;
    public AnonymousClass1M9 A02;
    public C32791hl A03;
    public C32951i1 A04;
    public AnonymousClass11C A05;
    public C35681md A06;
    public C32291gx A07;
    public C18010vc A08;
    public AnonymousClass00H A09;
    public boolean A0A = false;

    public AndroidWear() {
        super("AndroidWear");
    }

    public static C139316yd A00(Context context, AnonymousClass1E7 r12) {
        PendingIntent A032 = C1408573i.A03(context, new Intent(A0C, C62952sG.A00(r12), context, AndroidWear.class), 134217728);
        String string = context.getString(2131891882);
        IconCompat A022 = IconCompat.A02((Resources) null, "", 2131232142);
        Bundle A0D2 = C17880vN.A0D();
        CharSequence A042 = C1409673t.A04(string);
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        return new C139316yd(A032, A0D2, A022, A042, C17900vP.A0s(A132, A132.isEmpty() ? 1 : 0), C17900vP.A0s(A13, A13.isEmpty() ? 1 : 0), 2, true, false);
    }

    public static C139316yd A01(Context context, AnonymousClass1E7 r8, AnonymousClass206 r9, String str, int i) {
        Intent intent = new Intent(A0E, C62952sG.A00(r8).buildUpon().fragment(C17890vO.A0Q()).build(), context, AndroidWear.class);
        AnonymousClass4aU.A00(intent, r9.A0v);
        intent.putExtra("reaction", str);
        PendingIntent A032 = C1408573i.A03(context, intent, 0);
        IconCompat A022 = IconCompat.A02((Resources) null, "", i);
        Bundle A0D2 = C17880vN.A0D();
        CharSequence A042 = C1409673t.A04(str);
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        return new C139316yd(A032, A0D2, A022, A042, C17900vP.A0s(A132, A132.isEmpty() ? 1 : 0), C17900vP.A0s(A13, A13.isEmpty() ? 1 : 0), 8, true, false);
    }

    public static AnonymousClass73W A02(Context context, Bitmap bitmap, C24921Me r22, C18000vb r23, AnonymousClass122 r24, AnonymousClass1NJ r25, AnonymousClass1E7 r26, C18030ve r27, C60182nW r28, C217217d r29, AnonymousClass1W6 r30, boolean z, boolean z2, boolean z3) {
        String str;
        CharSequence charSequence;
        CharSequence A0I;
        AnonymousClass73W r0 = new AnonymousClass73W();
        Context context2 = context;
        C60182nW r5 = r28;
        if (z) {
            AnonymousClass206 r2 = r5.A00;
            if ((r2 instanceof C438421d) && ((AnonymousClass21V) r2).A02 != null) {
                AnonymousClass73W r3 = new AnonymousClass73W();
                r3.A05 = 4 | r3.A05;
                C1409673t r1 = new C1409673t(context2, (String) null);
                r3.A04(r1);
                r0.A0D.add(r1.A05());
            }
        }
        AnonymousClass1E7 r12 = r26;
        if (z2) {
            Class<AnonymousClass1BI> cls = AnonymousClass1BI.class;
            C54242dp BUp = r24.BUp((AnonymousClass1BI) r12.A06(cls), 20, 1, -1);
            Cursor cursor = BUp.A00;
            CharSequence charSequence2 = "";
            if (cursor != null) {
                try {
                    if (cursor.moveToLast()) {
                        if (r25.A07((AnonymousClass1BI) r12.A06(cls), BUp.A02)) {
                            charSequence = TextUtils.concat(new CharSequence[]{charSequence2, "…"});
                        } else {
                            charSequence = charSequence2;
                        }
                        do {
                            AnonymousClass1BI r210 = (AnonymousClass1BI) r12.A06(cls);
                            C17960vV.A07(r210);
                            AnonymousClass206 A022 = r30.A02(cursor, r210);
                            if (!(A022 == null || A022.A0u == 90 || (A0I = r29.A0I(r12, A022, false, true, true)) == charSequence2)) {
                                if (charSequence != charSequence2) {
                                    charSequence = TextUtils.concat(new CharSequence[]{charSequence, "\n\n"});
                                }
                                charSequence = TextUtils.concat(new CharSequence[]{charSequence, A0I});
                            }
                        } while (cursor.moveToPrevious());
                        charSequence2 = charSequence;
                    }
                } finally {
                    cursor.close();
                }
            }
            C1409673t r7 = new C1409673t(context2, (String) null);
            C17900vP.A0L(r7, charSequence2);
            AnonymousClass73W r6 = new AnonymousClass73W();
            r6.A05 = 8 | r6.A05;
            r6.A04(r7);
            r0.A0D.add(r7.A05());
        }
        if (z3) {
            String A0q = C17880vN.A0q(context2, r22.A0I(r12), new Object[1], 0, 2131895163);
            String[] A0R = r23.A0R(A0G);
            String[] strArr = new String[2];
            if (Build.VERSION.SDK_INT >= 23) {
                strArr[0] = "&#x1F603;";
                str = "&#x1F61E;";
            } else {
                strArr[0] = ":-)";
                str = ":-(";
            }
            strArr[1] = str;
            HashSet A12 = C17880vN.A12();
            Bundle A0D2 = C17880vN.A0D();
            String[][] strArr2 = {strArr, A0R};
            int i = 0;
            int i2 = 0;
            do {
                i2 += strArr2[i].length;
                i++;
            } while (i < 2);
            Object[] copyOf = Arrays.copyOf(strArr2[0], i2);
            int length = strArr2[0].length;
            String[] strArr3 = strArr2[1];
            System.arraycopy(strArr3, 0, copyOf, length, strArr3.length);
            C129536hx r15 = new C129536hx(A0D2, A0q, "android_wear_voice_input", A12, (CharSequence[]) copyOf);
            Intent intent = new Intent(A0F, C62952sG.A00(r12), context2, AndroidWear.class);
            C18030ve r62 = r27;
            C18020vd.A03(intent, r12, r62);
            int i3 = 134217728;
            C1408573i.A04(intent, 134217728);
            if (C1408573i.A02) {
                i3 = 167772160;
            }
            PendingIntent service = PendingIntent.getService(context2, 0, intent, i3);
            CharSequence charSequence3 = r15.A01;
            IconCompat A023 = IconCompat.A02((Resources) null, "", 2131232245);
            Bundle A0D3 = C17880vN.A0D();
            CharSequence A042 = C1409673t.A04(charSequence3);
            ArrayList A13 = AnonymousClass000.A13();
            A13.add(r15);
            ArrayList A132 = AnonymousClass000.A13();
            ArrayList A133 = AnonymousClass000.A13();
            Iterator it = A13.iterator();
            while (it.hasNext()) {
                A133.add(it.next());
            }
            r0.A0C.add(new C139316yd(service, A0D3, A023, A042, C17900vP.A0s(A133, A133.isEmpty() ? 1 : 0), C17900vP.A0s(A132, A132.isEmpty() ? 1 : 0), 0, true, true));
            if (C18020vd.A05(C18040vf.A02, r62, 2773)) {
                r0.A0C.add(A01(context2, r12, r5.A00, "👍", 2131232350));
                r0.A0C.add(A01(context2, r12, r5.A00, "❤️", 2131231904));
            }
        }
        r0.A0C.add(A00(context2, r12));
        Bitmap bitmap2 = bitmap;
        if (bitmap != null) {
            r0.A09 = bitmap2;
        }
        return r0;
    }

    public static void A03(AndroidWear androidWear, boolean z) {
        C32291gx.A00(androidWear.A07, (AnonymousClass206) null, true, true, true, false, z, false);
    }

    public void A08() {
        if (!this.A0A) {
            this.A0A = true;
            AnonymousClass10E r1 = ((C31221fD) ((C008503u) generatedComponent())).A07;
            this.A00 = AnonymousClass10E.A12(r1);
            this.A01 = (C33251iW) r1.ABA.get();
            this.A02 = AnonymousClass10E.A4z(r1);
            this.A05 = (AnonymousClass11C) r1.AAp.get();
            this.A09 = C000200d.A00(r1.A7T);
            this.A04 = (C32951i1) r1.A28.get();
            this.A06 = (C35681md) r1.A7N.get();
            this.A07 = (C32291gx) r1.A6X.get();
            this.A03 = (C32791hl) r1.A2t.get();
            this.A08 = (C18010vc) r1.A9s.get();
        }
    }

    public void onCreate() {
        Log.i("android-wear/onCreate");
        A08();
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("android-wear/onDestroy");
        super.onDestroy();
    }

    public void onHandleIntent(Intent intent) {
        AnonymousClass1KB r4;
        Object obj;
        String str;
        int i;
        Runnable akY;
        AnonymousClass1KB r2;
        Runnable r1;
        if (intent != null) {
            Bundle A012 = C137046up.A01(intent);
            AnonymousClass1E7 A0B2 = this.A02.A0B(intent);
            if (A0B2 == null) {
                r4 = this.A00;
                akY = new C21425Ajs((Object) this, 7);
            } else {
                if (A012 != null) {
                    CharSequence charSequence = A012.getCharSequence("android_wear_voice_input");
                    if (charSequence != null) {
                        str = charSequence.toString().trim();
                    } else {
                        str = null;
                    }
                    if (!C26302CxJ.A0V(this.A05, this.A08, str)) {
                        Log.i("androidwear/voiceinputfromandroidwear/message is empty");
                        r2 = this.A00;
                        r1 = new C21425Ajs((Object) this, 8);
                    } else {
                        r4 = this.A00;
                        i = 46;
                        obj = A0B2;
                        akY = new C21467AkY(this, obj, str, i);
                    }
                } else if (C17890vO.A1S(intent, A0E)) {
                    str = intent.getStringExtra("reaction");
                    Object A022 = AnonymousClass4aU.A02(intent);
                    if (str != null && A022 != null) {
                        r4 = this.A00;
                        i = 47;
                        obj = A022;
                        akY = new C21467AkY(this, obj, str, i);
                    } else {
                        return;
                    }
                } else if (C17890vO.A1S(intent, A0C)) {
                    r2 = this.A00;
                    r1 = new C70653Bz(this, A0B2, 6);
                } else if (C17890vO.A1S(intent, A0D)) {
                    AnonymousClass1BI A002 = AnonymousClass1E7.A00(A0B2);
                    if (!C22971Dz.A0V(A002)) {
                        Log.e("androidwear/ACTION_MUTE_NEWSLETTER for non-newsletter jid/ignoring");
                        return;
                    }
                    C29681ch r22 = (C29681ch) A002;
                    ((C32991i5) this.A09.get()).A09(r22, true);
                    this.A06.A09(r22);
                    A03(this, true);
                    return;
                } else {
                    return;
                }
                r2.A0J(r1);
                return;
            }
            r4.A0J(akY);
        }
    }

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("com.whatsapp");
        A0C = AnonymousClass000.A0y(".intent.action.MARK_AS_READ", A10);
    }
}
