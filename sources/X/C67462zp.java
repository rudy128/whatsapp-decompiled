package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2zp  reason: invalid class name and case insensitive filesystem */
public final class C67462zp implements AnonymousClass1L0 {
    public final AnonymousClass1QR A00;
    public final AnonymousClass1QO A01;
    public final AnonymousClass1QS A02;
    public final C31001er A03;
    public final AQF A04;
    public final C170648qR A05;
    public final C18030ve A06;
    public final AnonymousClass72F A07;
    public final C31011es A08;
    public final C31031eu A09;
    public final AnonymousClass10I A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;

    public /* synthetic */ void Bqg() {
    }

    public void Bqh() {
        C63522tF A002;
        AnonymousClass1QO r6 = this.A01;
        if (r6.A03()) {
            AnonymousClass1QR r5 = this.A00;
            Integer[] numArr = new Integer[4];
            numArr[0] = 20;
            numArr[1] = 401;
            numArr[2] = 417;
            C17890vO.A1G(numArr, 418);
            Integer[] numArr2 = new Integer[1];
            C17880vN.A1T(numArr2, 40, 0);
            List A0X = r5.A0X(numArr, numArr2, -1);
            C18070vi.A0X(A0X);
            if (A0X.size() > 0) {
                C31001er r2 = this.A03;
                C63522tF A003 = r2.A00();
                this.A02.A06().CBq(A003, A0X);
                r2.A01(A003);
            }
        }
        C31011es r52 = this.A08;
        synchronized (r52) {
            C31001er r3 = r52.A01;
            long A012 = AnonymousClass11P.A01(r3.A01);
            long j = A012 - (A012 % 86400000);
            ArrayList A13 = AnonymousClass000.A13();
            SharedPreferences sharedPreferences = r3.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r3.A02.A05("payment_daily_usage_preferences");
                r3.A00 = sharedPreferences;
            }
            Map<String, ?> all = sharedPreferences.getAll();
            SharedPreferences sharedPreferences2 = r3.A00;
            if (sharedPreferences2 == null) {
                sharedPreferences2 = r3.A02.A05("payment_daily_usage_preferences");
                r3.A00 = sharedPreferences2;
            }
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            Iterator A15 = AnonymousClass000.A15(all);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                String obj = A16.getValue().toString();
                if (!obj.isEmpty() && (A002 = C63522tF.A00(obj)) != null && A002.A0G < j) {
                    A13.add(A002);
                    edit.remove(C17880vN.A0x(A16));
                }
            }
            edit.apply();
            A13.size();
            Iterator it = A13.iterator();
            while (it.hasNext()) {
                C63522tF r4 = (C63522tF) it.next();
                AnonymousClass18K r32 = r52.A00;
                AnonymousClass2HH r22 = new AnonymousClass2HH();
                r22.A05 = Long.valueOf(r4.A0H);
                r22.A06 = Long.valueOf(r4.A02);
                r22.A09 = Long.valueOf(r4.A05);
                r22.A07 = Long.valueOf(r4.A03);
                r22.A08 = Long.valueOf(r4.A04);
                r22.A0F = Long.valueOf(r4.A0B);
                r22.A0E = Long.valueOf(r4.A0A);
                r22.A0C = Long.valueOf(r4.A08);
                r22.A0B = Long.valueOf(r4.A07);
                r22.A0D = Long.valueOf(r4.A09);
                r22.A0A = Long.valueOf(r4.A06);
                r22.A04 = Long.valueOf(r4.A01);
                r22.A00 = C17880vN.A0n(r4.A0D.size());
                r22.A01 = C17880vN.A0n(r4.A0F.size());
                r22.A03 = Long.valueOf(r4.A00);
                r22.A02 = C17880vN.A0n(r4.A0E.size());
                r22.A0G = r4.A0C;
                r32.CC7(r22);
            }
        }
        this.A09.A04();
        SharedPreferences A052 = ((C52422at) this.A0B.get()).A00.A05("hybrid_payment_methods_used");
        C18070vi.A0X(A052);
        C17900vP.A0J(A052);
        ((C31021et) this.A0C.get()).A04();
        if (r6.A03()) {
            if (C18020vd.A05(C18040vf.A02, this.A06, 991)) {
                C170648qR r53 = this.A05;
                int nextInt = new Random().nextInt(C170648qR.A0E);
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                C17880vN.A1T(objArr, nextInt, 0);
                String.format(locale, "BloksAssetManager/triggerBackgroundFetchWithJitter triggering bloks fetch in %d ms", objArr);
                r53.A03.CGv(new C21452AkJ(r53), (long) nextInt);
            }
        }
        C18030ve r23 = this.A06;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r23, 629) || C18020vd.A05(r1, r23, 605)) {
            AnonymousClass72F r42 = this.A07;
            C19830z4 r33 = r42.A02;
            if (C17880vN.A1W(C17890vO.A0B(r33), "payment_background_batch_require_fetch") && r33.A2b("payment_backgrounds_batch_last_fetch_timestamp", TimeUnit.DAYS.toMillis(7))) {
                r42.A01.A0J(new C70653Bz(r42, r42.A07.A00(), 37));
            }
        }
    }

    public void Bqi() {
        C17890vO.A0v(this.A0A, this, 33);
    }

    public C67462zp(C170648qR r1, AnonymousClass1QR r2, C18030ve r3, AnonymousClass1QO r4, AnonymousClass1QS r5, AnonymousClass72F r6, C31001er r7, C31011es r8, C31031eu r9, AQF aqf, AnonymousClass10I r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        C18070vi.A0w(r8, r4, r12, r2, r13);
        C18070vi.A0x(r9, r6, r7, r5, aqf);
        C18070vi.A0r(r1, r3, r11);
        this.A08 = r8;
        this.A01 = r4;
        this.A0C = r12;
        this.A00 = r2;
        this.A0B = r13;
        this.A09 = r9;
        this.A07 = r6;
        this.A03 = r7;
        this.A02 = r5;
        this.A04 = aqf;
        this.A05 = r1;
        this.A06 = r3;
        this.A0A = r11;
    }
}
