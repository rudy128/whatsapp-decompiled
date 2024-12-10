package com.whatsapp.report;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11P;
import X.AnonymousClass129;
import X.AnonymousClass18K;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1J8;
import X.AnonymousClass1KB;
import X.AnonymousClass1WR;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4DZ;
import X.AnonymousClass6ME;
import X.AnonymousClass6MF;
import X.AnonymousClass6XN;
import X.AnonymousClass6XO;
import X.AnonymousClass79P;
import X.AnonymousClass7FH;
import X.C000200d;
import X.C108955ca;
import X.C108975cc;
import X.C108985cd;
import X.C109005cf;
import X.C1180361x;
import X.C120676Ev;
import X.C121706Le;
import X.C132086mB;
import X.C136946uf;
import X.C1423279a;
import X.C143877Fd;
import X.C146527Pl;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C19880zA;
import X.C19890zB;
import X.C22339B3q;
import X.C24681Lg;
import X.C27301Vn;
import X.C36361nl;
import X.C39441t5;
import X.C438921i;
import X.C53952dM;
import X.C58312kU;
import X.C72403Lu;
import X.C72453Mb;
import X.C72473Md;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewStub;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.list.footer.WDSSectionFooter;
import com.whatsapp.wds.components.toggle.WDSSwitch;

public final class ReportActivity extends AnonymousClass1FY implements C72403Lu {
    public ViewStub A00;
    public ViewStub A01;
    public C19880zA A02;
    public C36361nl A03;
    public C27301Vn A04;
    public C24681Lg A05;
    public AnonymousClass18K A06;
    public BusinessActivityReportViewModel A07;
    public C132086mB A08;
    public C136946uf A09;
    public C136946uf A0A;
    public C136946uf A0B;
    public AnonymousClass6ME A0C;
    public AnonymousClass129 A0D;
    public C53952dM A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public ViewStub A0M;
    public C121706Le A0N;
    public AnonymousClass6MF A0O;
    public boolean A0P;
    public final AnonymousClass1WR A0Q;

    private final void A0Q(View view, Integer num, int i) {
        View view2 = view;
        int i2 = 2131627594;
        if (view instanceof ViewStub) {
            ViewStub viewStub = (ViewStub) view2;
            if (!AnonymousClass1J8.A05(this.A0E)) {
                i2 = i;
            }
            view2 = AnonymousClass3MY.A0G(viewStub, i2);
            C18070vi.A0X(view2);
        }
        if (view2 instanceof WDSSectionFooter) {
            WDSSectionFooter wDSSectionFooter = (WDSSectionFooter) view2;
            int i3 = 2131892769;
            if (num.intValue() != 2) {
                i3 = 2131890649;
            }
            wDSSectionFooter.setFooterTextWithLink(AnonymousClass3MY.A0m(getResources(), i3), "learn-more", AnonymousClass4DZ.A02, new C39441t5(this.A0E), new C146527Pl(this, num, 3));
            WaTextView waTextView = wDSSectionFooter.A01.A01;
            if (waTextView != null) {
                AnonymousClass3MZ.A1Q(waTextView, this.A08);
            }
        } else if (view2 instanceof TextEmojiLabel) {
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) view2;
            AnonymousClass3Ma.A1L(this.A0E, textEmojiLabel);
            AnonymousClass3Ma.A1K(textEmojiLabel, this.A08);
            int i4 = 2131892769;
            if (num.intValue() != 2) {
                i4 = 2131890649;
            }
            AnonymousClass00H r0 = this.A0K;
            if (r0 != null) {
                ((C58312kU) r0.get()).A00(this, textEmojiLabel, num, i4);
            } else {
                C18070vi.A11("reportLinkUtil");
                throw null;
            }
        }
    }

    public static final boolean A0q(ReportActivity reportActivity, Integer num) {
        ReportActivity reportActivity2 = reportActivity;
        if (!reportActivity.A05.A0N()) {
            return false;
        }
        if (reportActivity.A0O != null) {
            reportActivity.A0O = null;
        }
        AnonymousClass1KB r4 = reportActivity.A05;
        C18070vi.A0W(r4);
        AnonymousClass11P r5 = reportActivity.A05;
        C18070vi.A0W(r5);
        AnonymousClass6MF r2 = new AnonymousClass6MF(reportActivity2, r4, r5, reportActivity, num);
        reportActivity.A0O = r2;
        AnonymousClass3MW.A1T(r2, reportActivity.A05, 0);
        A0c(reportActivity, num, 1);
        return true;
    }

    public void CDp(Integer num) {
        String str;
        C143877Fd r0;
        C136946uf r12;
        int i;
        int i2;
        boolean z;
        Integer num2 = num;
        C18070vi.A0d(num2, 0);
        int intValue = num2.intValue();
        if (intValue != 3) {
            if (intValue != 1) {
                AnonymousClass00H r02 = this.A0J;
                if (r02 != null) {
                    r0 = (C143877Fd) C18070vi.A0E(r02);
                    r12 = this.A0B;
                    i = 2131755272;
                } else {
                    str = "newsletterGdprReport";
                }
            } else {
                AnonymousClass00H r03 = this.A0H;
                if (r03 != null) {
                    r0 = (C143877Fd) C18070vi.A0E(r03);
                    r12 = this.A0A;
                    i = 2131755154;
                } else {
                    str = "gdprReport";
                }
            }
            if (r12 != null) {
                Integer A072 = r0.A07();
                int intValue2 = A072.intValue();
                if (intValue2 == 0) {
                    if (num2 == AnonymousClass00R.A0C) {
                        i2 = 2131892773;
                    } else if (num2 == AnonymousClass00R.A0N) {
                        i2 = 2131898458;
                    } else {
                        if (!C18020vd.A05(C18040vf.A02, this.A0E, 455)) {
                            AnonymousClass00H r04 = this.A0I;
                            if (r04 != null) {
                                if (!C72453Mb.A1X(r04)) {
                                    A4b();
                                    i2 = 2131890651;
                                }
                            }
                            str = "newsletterConfig";
                        }
                        i2 = 2131890652;
                    }
                    r12.A01(new C146527Pl(this, num2, 4), i2);
                    String A0k = C72473Md.A0k(getResources(), 3, 2131755154);
                    C18070vi.A0X(A0k);
                    r12.A04(A0k);
                    if (num2 == AnonymousClass00R.A01) {
                        if (!C18020vd.A05(C18040vf.A02, this.A0E, 455)) {
                            AnonymousClass00H r05 = this.A0I;
                            if (r05 != null) {
                                if (!C72453Mb.A1X(r05)) {
                                    A4b();
                                    return;
                                }
                            }
                            str = "newsletterConfig";
                        }
                        r12.A09.setVisibility(0);
                        return;
                    }
                    return;
                } else if (intValue2 == 1) {
                    int A002 = C22339B3q.A00(((double) (r0.A04() - AnonymousClass11P.A01(this.A05))) / 8.64E7d);
                    if (A002 < 1) {
                        A002 = 1;
                    }
                    C18000vb r5 = this.A00;
                    C18070vi.A0W(r5);
                    String A10 = AnonymousClass3Ma.A10(this, AnonymousClass6XO.A00(r5, 2, r0.A04()), new Object[1], 0, 2131890656);
                    String A0k2 = C72473Md.A0k(getResources(), A002, i);
                    C18070vi.A0X(A0k2);
                    r12.A05(A10, A0k2);
                    return;
                } else if (intValue2 == 2 || intValue2 == 4) {
                    boolean A1Z = AnonymousClass000.A1Z(A072, AnonymousClass00R.A0Y);
                    long A022 = r0.A02();
                    C146527Pl r13 = new C146527Pl(this, r0, 5);
                    long A042 = r0.A04();
                    long A032 = r0.A03();
                    if (r0 instanceof C120676Ev) {
                        z = ((C120676Ev) r0).A00;
                    } else {
                        C438921i A052 = r0.A05();
                        if (A052 != null) {
                            z = AnonymousClass3Ma.A0M(A052).A0f;
                        } else {
                            z = false;
                        }
                    }
                    r12.A02(r13, 2131890643, A022, A042, A032, z, A1Z);
                    return;
                } else if (intValue2 == 3) {
                    r12.A03(new C146527Pl(this, num2, 6), r0.A02(), r0.A04(), r0.A03());
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            AnonymousClass00H r06 = this.A0L;
            if (r06 != null) {
                C108955ca.A1S(r06);
                return;
            }
            str = "wamoGdprReport";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A0c(ReportActivity reportActivity, Integer num, int i) {
        if (num == AnonymousClass00R.A0C) {
            C1180361x r1 = new C1180361x();
            r1.A00 = Integer.valueOf(i);
            AnonymousClass18K r0 = reportActivity.A06;
            if (r0 != null) {
                r0.CC7(r1);
            } else {
                C18070vi.A11("wamRuntime");
                throw null;
            }
        }
    }

    private final void A0d(C136946uf r4, Integer num) {
        String str;
        if (r4 != null) {
            int intValue = num.intValue();
            SharedPreferences A0M2 = C72453Mb.A0M(this);
            if (intValue != 2) {
                str = "automatic_account_report_enabled";
            } else {
                str = "automatic_channel_report_enabled";
            }
            boolean A1W = C17880vN.A1W(A0M2, str);
            WDSSwitch wDSSwitch = r4.A03;
            if (wDSSwitch != null) {
                wDSSwitch.setChecked(A1W);
            }
            View view = r4.A00;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = r4.A01;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = r4.A02;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            AnonymousClass79P r0 = new AnonymousClass79P(this, num);
            if (wDSSwitch != null) {
                wDSSwitch.setOnCheckedChangeListener(r0);
            }
        }
    }

    public void A2y() {
        if (!this.A0P) {
            this.A0P = true;
            AnonymousClass10E A0A2 = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r2 = A0A2.A00;
            C109005cf.A0d(A0A2, r2, this);
            C109005cf.A0e(A0A2, r2, this, r2.A5A);
            this.A0F = C000200d.A00(r2.A5X);
            this.A0G = C000200d.A00(r2.A6E);
            this.A0D = C108975cc.A0O(A0A2);
            this.A0H = C000200d.A00(A0A2.AUM);
            this.A08 = r2.A9j();
            this.A03 = C108985cd.A0N(A0A2);
            this.A05 = AnonymousClass3MZ.A0o(A0A2);
            this.A0I = C000200d.A00(A0A2.A7C);
            this.A0J = C000200d.A00(A0A2.Aaq);
            this.A0K = C000200d.A00(r2.AGD);
            this.A04 = (C27301Vn) A0A2.A9A.get();
            this.A06 = AnonymousClass3Ma.A0g(A0A2);
            this.A0L = C000200d.A00(r2.AJF);
            this.A0E = (C53952dM) A0A2.AnD.get();
            this.A02 = C19890zB.A00;
        }
    }

    public final void A4b() {
        if (this.A02 == null) {
            C18070vi.A11("wamoRaiManager");
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [com.whatsapp.report.DeleteReportConfirmationDialogFragment, java.lang.Object, com.whatsapp.report.Hilt_DeleteReportConfirmationDialogFragment] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r22) {
        /*
            r21 = this;
            r11 = r21
            r0 = r22
            super.onCreate(r0)
            r0 = 2131896927(0x7f122a5f, float:1.942873E38)
            r11.setTitle(r0)
            r0 = 2131624097(0x7f0e00a1, float:1.8875364E38)
            r11.setContentView((int) r0)
            X.C72473Md.A17(r11)
            X.0ve r1 = r11.A0E
            r0 = 455(0x1c7, float:6.38E-43)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 != 0) goto L_0x0245
            X.00H r0 = r11.A0I
            if (r0 == 0) goto L_0x0386
            boolean r0 = X.C72453Mb.A1X(r0)
            if (r0 != 0) goto L_0x0245
            r11.A4b()
            r0 = 2131431079(0x7f0b0ea7, float:1.8483877E38)
            android.view.View r3 = r11.findViewById(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.ImageView"
            X.C18070vi.A0z(r3, r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            X.0vb r1 = r11.A00
            r0 = 2131232959(0x7f0808bf, float:1.8082042E38)
            X.AnonymousClass3NL.A01(r11, r3, r1, r0)
            r0 = 2131431078(0x7f0b0ea6, float:1.8483875E38)
            android.view.View r3 = X.AnonymousClass3MY.A0C(r11, r0)
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            r0 = 2131626719(0x7f0e0adf, float:1.8880682E38)
            r11.A0Q(r3, r1, r0)
        L_0x0054:
            r0 = 2131434587(0x7f0b1c5b, float:1.8490992E38)
            android.view.View r12 = r11.findViewById(r0)
            r0 = 2131434589(0x7f0b1c5d, float:1.8490996E38)
            android.view.View r5 = r11.findViewById(r0)
            r0 = 2131434614(0x7f0b1c76, float:1.8491047E38)
            android.view.View r4 = r11.findViewById(r0)
            r0 = 2131427939(0x7f0b0263, float:1.8477508E38)
            r1 = 2131427939(0x7f0b0263, float:1.8477508E38)
            android.view.ViewStub r0 = X.AnonymousClass3MW.A0E(r12, r0)
            r11.A00 = r0
            android.view.ViewStub r0 = X.AnonymousClass3MW.A0E(r5, r1)
            r11.A01 = r0
            android.view.ViewStub r0 = X.AnonymousClass3MW.A0E(r4, r1)
            r11.A0M = r0
            X.C18070vi.A0b(r12)
            android.view.ViewStub r13 = r11.A00
            X.11C r14 = r11.A08
            X.C18070vi.A0W(r14)
            X.0ve r1 = r11.A0E
            X.C18070vi.A0W(r1)
            X.00H r0 = r11.A0K
            if (r0 == 0) goto L_0x0383
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.2kU r0 = (X.C58312kU) r0
            java.lang.Integer r3 = X.AnonymousClass00R.A01
            X.0vb r15 = r11.A00
            X.C18070vi.A0W(r15)
            X.6uf r10 = new X.6uf
            r17 = r0
            r18 = r3
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r11.A0A = r10
            r0 = 44
            X.AFS r1 = new X.AFS
            r1.<init>(r11, r0)
            android.view.View r0 = r10.A07
            r0.setOnClickListener(r1)
            r0 = 2131434547(0x7f0b1c33, float:1.849091E38)
            android.view.View r1 = X.C18070vi.A05(r12, r0)
            r0 = 2131626734(0x7f0e0aee, float:1.8880713E38)
            r11.A0Q(r1, r3, r0)
            X.6uf r0 = r11.A0A
            r11.A0d(r0, r3)
            r0 = 2131434596(0x7f0b1c64, float:1.849101E38)
            android.view.View r12 = X.AnonymousClass3MY.A0H(r11, r0)
            X.0ve r1 = r11.A0E
            r0 = 455(0x1c7, float:6.38E-43)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 != 0) goto L_0x01e6
            r0 = 2131434596(0x7f0b1c64, float:1.849101E38)
            X.C72463Mc.A19(r11, r0)
        L_0x00e3:
            X.C18070vi.A0b(r5)
            X.00H r0 = r11.A0I
            if (r0 == 0) goto L_0x0386
            boolean r0 = X.C72453Mb.A1X(r0)
            if (r0 != 0) goto L_0x0179
            r0 = 2131434589(0x7f0b1c5d, float:1.8490996E38)
            X.C72463Mc.A19(r11, r0)
        L_0x00f6:
            X.C18070vi.A0b(r4)
            r11.A4b()
            r0 = 2131434614(0x7f0b1c76, float:1.8491047E38)
            X.C72463Mc.A19(r11, r0)
            X.1Lg r1 = r11.A05
            if (r1 == 0) goto L_0x0380
            X.1WR r0 = r11.A0Q
            r1.registerObserver(r0)
            X.00H r0 = r11.A0H
            if (r0 == 0) goto L_0x037d
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.7Fd r0 = (X.C143877Fd) r0
            r11.A0V(r0, r3)
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            X.00H r0 = r11.A0J
            if (r0 == 0) goto L_0x0389
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.7Fd r0 = (X.C143877Fd) r0
            r11.A0V(r0, r1)
            r11.A4b()
            X.0ve r1 = r11.A0E
            r0 = 455(0x1c7, float:6.38E-43)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x037a
            X.1It r1 = X.AnonymousClass3MW.A0N(r11)
            java.lang.Class<com.whatsapp.report.BusinessActivityReportViewModel> r0 = com.whatsapp.report.BusinessActivityReportViewModel.class
            X.1J2 r0 = r1.A00(r0)
            com.whatsapp.report.BusinessActivityReportViewModel r0 = (com.whatsapp.report.BusinessActivityReportViewModel) r0
            r11.A07 = r0
            if (r0 == 0) goto L_0x0150
            X.1DT r2 = r0.A02
            X.80y r1 = new X.80y
            r1.<init>(r11)
            r0 = 13
            X.AnonymousClass7AS.A00(r11, r2, r1, r0)
        L_0x0150:
            com.whatsapp.report.BusinessActivityReportViewModel r0 = r11.A07
            if (r0 == 0) goto L_0x0160
            X.1DT r2 = r0.A00
            X.80z r1 = new X.80z
            r1.<init>(r11)
            r0 = 13
            X.AnonymousClass7AS.A00(r11, r2, r1, r0)
        L_0x0160:
            com.whatsapp.report.BusinessActivityReportViewModel r0 = r11.A07
            if (r0 == 0) goto L_0x0170
            X.1DT r2 = r0.A01
            X.810 r1 = new X.810
            r1.<init>(r11)
            r0 = 13
            X.AnonymousClass7AS.A00(r11, r2, r1, r0)
        L_0x0170:
            com.whatsapp.report.BusinessActivityReportViewModel r7 = r11.A07
            if (r7 == 0) goto L_0x02ec
            X.1nU r6 = r7.A05
            monitor-enter(r6)
            goto L_0x0259
        L_0x0179:
            android.view.ViewStub r10 = r11.A01
            X.11C r9 = r11.A08
            X.C18070vi.A0W(r9)
            X.0ve r6 = r11.A0E
            X.C18070vi.A0W(r6)
            X.00H r0 = r11.A0K
            if (r0 == 0) goto L_0x0383
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.2kU r1 = (X.C58312kU) r1
            java.lang.Integer r7 = X.AnonymousClass00R.A0C
            X.0vb r0 = r11.A00
            X.C18070vi.A0W(r0)
            X.6uf r8 = new X.6uf
            r12 = r8
            r13 = r11
            r14 = r5
            r15 = r10
            r16 = r9
            r17 = r0
            r18 = r6
            r19 = r1
            r20 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r11.A0B = r8
            r6 = 2131892774(0x7f121a26, float:1.9420306E38)
            r1 = 2131892773(0x7f121a25, float:1.9420304E38)
            r0 = 2131892769(0x7f121a21, float:1.9420296E38)
            r8.A00(r6, r1, r0)
            X.6uf r0 = r11.A0B
            if (r0 == 0) goto L_0x01c2
            android.view.View r1 = r0.A08
            r0 = 8
            r1.setVisibility(r0)
        L_0x01c2:
            X.6uf r6 = r11.A0B
            if (r6 == 0) goto L_0x01d2
            r0 = 43
            X.AFS r1 = new X.AFS
            r1.<init>(r11, r0)
            android.view.View r0 = r6.A07
            r0.setOnClickListener(r1)
        L_0x01d2:
            r0 = 2131434547(0x7f0b1c33, float:1.849091E38)
            android.view.View r1 = X.C18070vi.A05(r5, r0)
            r0 = 2131626734(0x7f0e0aee, float:1.8880713E38)
            r11.A0Q(r1, r7, r0)
            X.6uf r0 = r11.A0B
            r11.A0d(r0, r7)
            goto L_0x00f6
        L_0x01e6:
            X.11C r8 = r11.A08
            X.C18070vi.A0W(r8)
            X.0ve r6 = r11.A0E
            X.C18070vi.A0W(r6)
            X.00H r0 = r11.A0K
            if (r0 == 0) goto L_0x0383
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.2kU r1 = (X.C58312kU) r1
            java.lang.Integer r18 = X.AnonymousClass00R.A00
            X.0vb r0 = r11.A00
            X.C18070vi.A0W(r0)
            r13 = 0
            X.6uf r7 = new X.6uf
            r10 = r7
            r14 = r8
            r15 = r0
            r16 = r6
            r17 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r11.A09 = r7
            r6 = 2131893439(0x7f121cbf, float:1.9421655E38)
            r1 = 2131893438(0x7f121cbe, float:1.9421653E38)
            r0 = 2131893433(0x7f121cb9, float:1.9421642E38)
            r7.A00(r6, r1, r0)
            X.6uf r0 = r11.A09
            if (r0 == 0) goto L_0x0227
            android.view.View r1 = r0.A08
            r0 = 8
            r1.setVisibility(r0)
        L_0x0227:
            com.whatsapp.report.DeleteReportConfirmationDialogFragment r7 = new com.whatsapp.report.DeleteReportConfirmationDialogFragment
            r7.<init>()
            X.7Ls r0 = new X.7Ls
            r0.<init>(r11)
            r7.A00 = r0
            X.6uf r6 = r11.A09
            if (r6 == 0) goto L_0x00e3
            r0 = 37
            X.4dP r1 = new X.4dP
            r1.<init>(r11, r7, r0)
            android.view.View r0 = r6.A07
            r0.setOnClickListener(r1)
            goto L_0x00e3
        L_0x0245:
            r0 = 2131434544(0x7f0b1c30, float:1.8490905E38)
            android.view.View r0 = r11.findViewById(r0)
            r1 = 8
            r0.setVisibility(r1)
            r0 = 2131434545(0x7f0b1c31, float:1.8490907E38)
            X.AnonymousClass3MX.A1H(r11, r0, r1)
            goto L_0x0054
        L_0x0259:
            int r5 = r6.A00()     // Catch:{ all -> 0x02df }
            if (r5 < 0) goto L_0x02d0
            r0 = 4
            if (r5 > r0) goto L_0x02d0
            r4 = 2
            if (r5 != r0) goto L_0x027c
            X.17r r0 = r6.A01     // Catch:{ all -> 0x02df }
            java.io.File r0 = r0.A0A()     // Catch:{ all -> 0x02df }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x02df }
            if (r0 != 0) goto L_0x0289
            java.lang.String r0 = "BusinessActivityReportManager/validate-state/report-media-file-missing"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x02df }
            X.0z4 r0 = r6.A03     // Catch:{ all -> 0x02df }
            r0.A19(r4)     // Catch:{ all -> 0x02df }
            goto L_0x02e2
        L_0x027c:
            if (r5 != r4) goto L_0x027f
            goto L_0x0283
        L_0x027f:
            r0 = 3
            if (r5 != r0) goto L_0x0289
            goto L_0x0296
        L_0x0283:
            X.76s r0 = r6.A01()     // Catch:{ all -> 0x02df }
            if (r0 == 0) goto L_0x029c
        L_0x0289:
            X.0z4 r0 = r6.A03     // Catch:{ all -> 0x02df }
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)     // Catch:{ all -> 0x02df }
            java.lang.String r0 = "business_activity_report_expiration_timestamp"
            long r2 = X.C17890vO.A05(r1, r0)     // Catch:{ all -> 0x02df }
            goto L_0x02a7
        L_0x0296:
            X.76s r0 = r6.A01()     // Catch:{ all -> 0x02df }
            if (r0 != 0) goto L_0x0289
        L_0x029c:
            java.lang.String r0 = "BusinessActivityReportManager/validate-state/report-message-missing"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x02df }
            X.0z4 r0 = r6.A03     // Catch:{ all -> 0x02df }
            r0.A15()     // Catch:{ all -> 0x02df }
            goto L_0x02e2
        L_0x02a7:
            if (r5 != r4) goto L_0x02e2
            X.11P r1 = r6.A02     // Catch:{ all -> 0x02df }
            long r4 = X.AnonymousClass11P.A01(r1)     // Catch:{ all -> 0x02df }
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x02e2
            long r4 = X.AnonymousClass11P.A01(r1)     // Catch:{ all -> 0x02df }
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x02e2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02df }
            java.lang.String r0 = "BusinessActivityReportManager/validate-state/report-too-old current:"
            r1.append(r0)     // Catch:{ all -> 0x02df }
            r1.append(r4)     // Catch:{ all -> 0x02df }
            java.lang.String r0 = " expired:"
            X.C17900vP.A0m(r0, r1, r2)     // Catch:{ all -> 0x02df }
            r6.A02()     // Catch:{ all -> 0x02df }
            goto L_0x02e2
        L_0x02d0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02df }
            java.lang.String r0 = "BusinessActivityReportManager/validate-state/wrong-state "
            X.C17900vP.A0i(r0, r1, r5)     // Catch:{ all -> 0x02df }
            X.0z4 r0 = r6.A03     // Catch:{ all -> 0x02df }
            r0.A15()     // Catch:{ all -> 0x02df }
            goto L_0x02e2
        L_0x02df:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x02e2:
            monitor-exit(r6)
            X.1DT r1 = r7.A02
            int r0 = r6.A00()
            X.AnonymousClass3MX.A1J(r1, r0)
        L_0x02ec:
            com.whatsapp.report.BusinessActivityReportViewModel r2 = r11.A07
            if (r2 == 0) goto L_0x037a
            X.1DT r1 = r2.A02
            java.lang.Object r0 = r1.A06()
            if (r0 == 0) goto L_0x037a
            int r0 = X.C72463Mc.A0A(r1)
            r5 = 4
            if (r0 == r5) goto L_0x037a
            X.7LR r8 = r2.A0C
            X.11E r0 = r8.A02
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x037b
            X.00H r0 = r8.A04
            java.lang.String r10 = X.C17890vO.A0T(r0)
            X.1OZ r7 = X.C17880vN.A0U(r0)
            r6 = 1
            X.1MD[] r3 = new X.AnonymousClass1MD[r6]
            java.lang.String r1 = "action"
            java.lang.String r0 = "status"
            boolean r2 = X.C17890vO.A1W(r1, r0, r3)
            java.lang.String r0 = "p2b"
            X.1ca r4 = new X.1ca
            r4.<init>(r0, r3)
            r0 = 6
            X.1MD[] r3 = new X.AnonymousClass1MD[r0]
            X.8v4 r1 = X.C173438v4.A00
            java.lang.String r0 = "to"
            X.C17880vN.A1I(r1, r0, r3, r2)
            X.11S r0 = r8.A01
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A01(r0)
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "from"
            X.C17880vN.A1Q(r0, r1, r3, r6)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:biz:p2b_report"
            X.C17890vO.A12(r1, r0, r3)
            java.lang.String r2 = "type"
            java.lang.String r0 = "get"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r0 = 3
            r3[r0] = r1
            java.lang.String r1 = "smax_id"
            java.lang.String r0 = "34"
            X.C17880vN.A1Q(r1, r0, r3, r5)
            java.lang.String r0 = "id"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r0, (java.lang.String) r10)
            r0 = 5
            r3[r0] = r1
            java.lang.String r0 = "iq"
            X.1ca r9 = new X.1ca
            r9.<init>((X.C29621ca) r4, (java.lang.String) r0, (X.AnonymousClass1MD[]) r3)
            r12 = 32000(0x7d00, double:1.581E-319)
            r11 = 265(0x109, float:3.71E-43)
            r7.A0J(r8, r9, r10, r11, r12)
            r2 = 1
        L_0x0371:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "app/sendGetReport success:"
            X.C17900vP.A0n(r0, r1, r2)
        L_0x037a:
            return
        L_0x037b:
            r2 = 0
            goto L_0x0371
        L_0x037d:
            java.lang.String r0 = "gdprReport"
            goto L_0x038b
        L_0x0380:
            java.lang.String r0 = "messageObservers"
            goto L_0x038b
        L_0x0383:
            java.lang.String r0 = "reportLinkUtil"
            goto L_0x038b
        L_0x0386:
            java.lang.String r0 = "newsletterConfig"
            goto L_0x038b
        L_0x0389:
            java.lang.String r0 = "newsletterGdprReport"
        L_0x038b:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.report.ReportActivity.onCreate(android.os.Bundle):void");
    }

    public ReportActivity(int i) {
        this.A0P = false;
        C1423279a.A00(this, 38);
    }

    public static final C143877Fd A03(ReportActivity reportActivity, Integer num) {
        AnonymousClass00H r0;
        String str;
        int intValue = num.intValue();
        if (intValue == 2) {
            r0 = reportActivity.A0J;
            if (r0 == null) {
                str = "newsletterGdprReport";
            }
            return (C143877Fd) r0.get();
        } else if (intValue == 3) {
            r0 = reportActivity.A0L;
            if (r0 == null) {
                str = "wamoGdprReport";
            }
            return (C143877Fd) r0.get();
        } else if (intValue != 1) {
            return null;
        } else {
            r0 = reportActivity.A0H;
            if (r0 == null) {
                str = "gdprReport";
            }
            return (C143877Fd) r0.get();
        }
        C18070vi.A11(str);
        throw null;
    }

    private final void A0V(C143877Fd r3, Integer num) {
        r3.A0C();
        if (AnonymousClass6XN.A00(r3.A07()) < 3) {
            C121706Le r1 = new C121706Le(this, this, num);
            this.A0N = r1;
            C17890vO.A0u(r1, this.A05);
        }
        CDp(num);
    }

    public void onDestroy() {
        super.onDestroy();
        boolean A1G = C108975cc.A1G(this.A0N);
        AnonymousClass6MF r0 = this.A0O;
        if (r0 != null) {
            r0.A0B(A1G);
        }
        AnonymousClass6ME r02 = this.A0C;
        if (r02 != null) {
            r02.A0B(A1G);
        }
        C24681Lg r1 = this.A05;
        if (r1 != null) {
            r1.unregisterObserver(this.A0Q);
            this.A0A = null;
            this.A09 = null;
            this.A0B = null;
            return;
        }
        C18070vi.A11("messageObservers");
        throw null;
    }

    public void onStart() {
        super.onStart();
        C27301Vn r2 = this.A04;
        if (r2 != null) {
            r2.BEJ(16, "GdprReport");
            C27301Vn r22 = this.A04;
            if (r22 != null) {
                r22.BEJ(32, "BusinessActivityReport");
                return;
            }
        }
        C18070vi.A11("waNotificationManager");
        throw null;
    }

    public ReportActivity() {
        this(0);
        this.A0Q = new AnonymousClass7FH(this, 4);
    }
}
