package X;

import android.content.Context;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.AbstractCollection;

/* renamed from: X.A4j  reason: case insensitive filesystem */
public class C20040A4j {
    public static final C201110w A0D;
    public static final C199410f A0E;
    public static final C199410f A0F;
    public static final C199410f A0G;
    public final C24921Me A00;
    public final C18000vb A01;
    public final C25181Nf A02;
    public final AnonymousClass1QR A03;
    public final AnonymousClass1KJ A04;
    public final C31061ex A05;
    public final AnonymousClass1QJ A06;
    public final C195859u1 A07;
    public final A27 A08;
    public final AnonymousClass1QE A09;
    public final AnonymousClass91T A0A;
    public final AnonymousClass9YR A0B;
    public final AnonymousClass10I A0C;

    static {
        AnonymousClass1F8 r1 = new AnonymousClass1F8();
        A00(r1, 404);
        A00(r1, 440);
        A00(r1, 442);
        A00(r1, 443);
        C199410f build = r1.build();
        A0F = build;
        AnonymousClass1F8 r12 = new AnonymousClass1F8();
        r12.addAll(build);
        r12.add((Object) 11502);
        r12.add((Object) 17010);
        A00(r12, 11455);
        A00(r12, 11466);
        A00(r12, 4002);
        A00(r12, 11481);
        A00(r12, 11478);
        A00(r12, 11480);
        A00(r12, 11465);
        A00(r12, 11479);
        A00(r12, 12750);
        A00(r12, 20951);
        C199410f build2 = r12.build();
        A0G = build2;
        AnonymousClass1F8 r13 = new AnonymousClass1F8();
        r13.addAll(build);
        r13.add((Object) 11502);
        r13.add((Object) 17010);
        A00(r13, 11503);
        A00(r13, 11495);
        C199410f build3 = r13.build();
        A0E = build3;
        C201210x r14 = new C201210x();
        r14.put("pay-precheck", build2);
        r14.put("upi-accept-collect", build3);
        A0D = r14.build();
    }

    public C20040A4j(C24921Me r2, C18000vb r3, C25181Nf r4, AnonymousClass1QR r5, C31061ex r6, AnonymousClass1QJ r7, C195859u1 r8, A27 a27, AnonymousClass1QE r10, AnonymousClass91T r11, AnonymousClass9YR r12, AnonymousClass10I r13) {
        AnonymousClass1KJ r0 = AnonymousClass1KL.A0B;
        this.A0A = r11;
        this.A0C = r13;
        this.A00 = r2;
        this.A01 = r3;
        this.A09 = r10;
        this.A04 = r0;
        this.A05 = r6;
        this.A07 = r8;
        this.A06 = r7;
        this.A08 = a27;
        this.A03 = r5;
        this.A02 = r4;
        this.A0B = r12;
    }

    public void A01(Context context, A7B a7b, C187369fh r15, String str) {
        AnonymousClass1QE r2;
        StringBuilder sb;
        String str2;
        Object[] objArr;
        int i;
        AnonymousClass9YR r22;
        String string;
        AnonymousClass1KN r23;
        String str3 = str;
        Object obj = A0D.get(str3);
        C17960vV.A07(obj);
        if (C108965cb.A1Z((AbstractCollection) obj, a7b.A00)) {
            AnonymousClass91T r8 = this.A0A;
            if (!C20752AXh.A01(r8, str3, a7b.A00, false)) {
                int i2 = a7b.A00;
                if (i2 != 4002) {
                    if (i2 != 11455) {
                        if (i2 == 11495) {
                            this.A09.A06(AnonymousClass001.A1I("collect request expired; showErrorAndFinish; error code: ", AnonymousClass000.A10(), i2));
                            this.A0C.CGF(new C70653Bz(this, r15, 48));
                            AnonymousClass1QJ r1 = this.A06;
                            if (r1.A01() == null || (r23 = r15.A00) == null) {
                                string = r8.getString(2131897312);
                            } else {
                                string = r1.A01().BLc(this.A01, r23);
                            }
                            r22 = this.A0B;
                            objArr = new Object[]{r15.A04, string};
                            i = 2131894004;
                        } else if (i2 == 12750) {
                            this.A09.A06(AnonymousClass001.A1I("request has been cancelled; showErrorAndFinish; error code: ", AnonymousClass000.A10(), i2));
                            String str4 = r15.A02;
                            UserJid userJid = r15.A01;
                            if (userJid != null) {
                                str4 = this.A00.A0I(this.A02.A01(userJid));
                            }
                            r22 = this.A0B;
                            i = 2131893975;
                            objArr = new Object[]{str4};
                        } else if (i2 == 17010) {
                            AnonymousClass4Yv.A01(r8, 26);
                            return;
                        } else if (i2 != 20951) {
                            if (i2 != 11465) {
                                if (i2 != 11466) {
                                    if (i2 != 11502) {
                                        if (i2 != 11503) {
                                            switch (i2) {
                                                case 11478:
                                                case 11480:
                                                case 11481:
                                                    break;
                                                case 11479:
                                                    break;
                                                default:
                                                    return;
                                            }
                                        } else {
                                            String A012 = this.A08.A01(i2);
                                            AnonymousClass9YR r5 = this.A0B;
                                            String valueOf = String.valueOf(a7b.A00);
                                            r5.A00.A5a(new C19967A1c(2131896985, A012), valueOf, new Object[0]);
                                            return;
                                        }
                                    }
                                }
                            }
                            this.A07.A01(context, r15.A01, (C196259ui) null, (BCC) null, (Boolean) null);
                            r2 = this.A09;
                            sb = AnonymousClass000.A10();
                            str2 = "invalid receiver vpa; showErrorAndFinish; error code: ";
                            sb.append(str2);
                            sb.append(i2);
                        } else {
                            Bundle A0D2 = C17880vN.A0D();
                            A0D2.putInt("error_code", i2);
                            if (!AnonymousClass4Yv.A02(r8)) {
                                r8.showDialog(33, A0D2);
                                return;
                            }
                            return;
                        }
                        r22.A00.A5a(new C19967A1c(i), String.valueOf(a7b.A00), objArr);
                        return;
                    }
                    this.A09.A06("sender max transactions or max amount per day limit; showErrorAndFinish");
                    String BLd = this.A04.BLd(this.A01, new BigDecimal(100000));
                    r22 = this.A0B;
                    i = 2131893913;
                    objArr = new Object[2];
                    C17880vN.A1T(objArr, 10, 0);
                    objArr[1] = BLd;
                    r22.A00.A5a(new C19967A1c(i), String.valueOf(a7b.A00), objArr);
                    return;
                }
                this.A05.A0A((C33661jB) null);
                r2 = this.A09;
                sb = AnonymousClass000.A10();
                str2 = "invalid sender vpa; showErrorAndFinish; get-methods; error code: ";
                sb.append(str2);
                sb.append(i2);
            } else {
                return;
            }
        } else {
            r2 = this.A09;
            sb = AnonymousClass000.A11(str3);
            sb.append(" error; showErrorAndFinish; error code: ");
            sb.append(a7b);
        }
        AnonymousClass8BS.A19(r2, sb);
        this.A0B.A00.A5W(a7b);
    }

    public static void A00(AnonymousClass1F8 r1, int i) {
        r1.add((Object) Integer.valueOf(i));
    }
}
