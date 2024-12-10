package com.whatsapp.payments.ui;

import X.A56;
import X.A8e;
import X.AFO;
import X.ARR;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass03S;
import X.AnonymousClass10I;
import X.AnonymousClass122;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1QD;
import X.AnonymousClass1QS;
import X.AnonymousClass1R2;
import X.AnonymousClass205;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aU;
import X.AnonymousClass6X6;
import X.AnonymousClass8BR;
import X.AnonymousClass8pQ;
import X.AnonymousClass92s;
import X.AnonymousClass92u;
import X.AnonymousClass960;
import X.BDt;
import X.C108945cZ;
import X.C161758Hq;
import X.C170278pb;
import X.C175378yc;
import X.C1768595x;
import X.C1768695y;
import X.C1768795z;
import X.C17880vN;
import X.C17960vV;
import X.C18000vb;
import X.C18030ve;
import X.C180609Nf;
import X.C18070vi;
import X.C183429Yf;
import X.C186159dk;
import X.C187399fk;
import X.C20063A5m;
import X.C20080A6g;
import X.C20112A7u;
import X.C20251ADj;
import X.C20279AEn;
import X.C20284AEs;
import X.C20304AFm;
import X.C20810AZn;
import X.C20815AZs;
import X.C20816AZt;
import X.C20821AZy;
import X.C20824Aa1;
import X.C20932Abm;
import X.C20933Abn;
import X.C21432Ajz;
import X.C21447AkE;
import X.C22941Dw;
import X.C31061ex;
import X.C36401np;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.ArrayList;
import java.util.List;

public final class HybridPaymentMethodPickerFragment extends Hilt_HybridPaymentMethodPickerFragment implements BDt {
    public AnonymousClass1KB A00;
    public WaButtonWithLoader A01;
    public C18000vb A02;
    public AnonymousClass122 A03;
    public C20284AEs A04;
    public C18030ve A05;
    public AnonymousClass1QD A06;
    public C31061ex A07;
    public AnonymousClass1QS A08;
    public C161758Hq A09;
    public C186159dk A0A;
    public C187399fk A0B;
    public AnonymousClass1R2 A0C;
    public C20279AEn A0D;
    public AnonymousClass205 A0E;
    public C36401np A0F;
    public AnonymousClass10I A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public List A0K;
    public boolean A0L;
    public List A0M;
    public boolean A0N;
    public boolean A0O;
    public final List A0P = AnonymousClass000.A13();
    public final C180609Nf A0Q = new C175378yc(this, 2);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625560, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        int i;
        String str;
        C18070vi.A0d(view, 0);
        ImageView A0C2 = AnonymousClass3Ma.A0C(view, 2131432918);
        Fragment fragment = this.A0E;
        if (fragment == null || fragment.A1E().A0K() <= 1) {
            A0C2.setImageDrawable(AnonymousClass03S.A01(view.getContext(), 2131231814));
            i = 16;
        } else {
            A0C2.setImageDrawable(AnonymousClass03S.A01(view.getContext(), 2131231675));
            i = 17;
        }
        AFO.A00(A0C2, this, i);
        C18000vb r4 = this.A02;
        if (r4 != null) {
            AnonymousClass1QS r3 = this.A08;
            if (r3 != null) {
                AnonymousClass00H r0 = this.A0J;
                if (r0 != null) {
                    this.A09 = new C161758Hq(r4, r3, new C20810AZn(this, 1), (A56) C18070vi.A0E(r0));
                    RecyclerView A0U = C108945cZ.A0U(view, 2131432751);
                    C161758Hq r02 = this.A09;
                    if (r02 != null) {
                        A0U.setAdapter(r02);
                        View A052 = C18070vi.A05(view, 2131436040);
                        if (this.A0E != null) {
                            AnonymousClass10I r2 = this.A0G;
                            if (r2 != null) {
                                r2.CGN(new C21432Ajz(this, A052, 11));
                            } else {
                                str = "waWorkers";
                            }
                        }
                        C161758Hq r1 = this.A09;
                        if (r1 != null) {
                            r1.A0U(A00(this));
                            WaButtonWithLoader waButtonWithLoader = (WaButtonWithLoader) AnonymousClass1HF.A06(view, 2131429535);
                            this.A01 = waButtonWithLoader;
                            if (waButtonWithLoader != null) {
                                waButtonWithLoader.setButtonText(2131887451);
                            }
                            WaButtonWithLoader waButtonWithLoader2 = this.A01;
                            if (waButtonWithLoader2 != null) {
                                waButtonWithLoader2.A00 = new AFO(this, 18);
                            }
                            ViewGroup viewGroup = (ViewGroup) C18070vi.A05(view, 2131430967);
                            C186159dk r03 = this.A0A;
                            if (r03 != null) {
                                LayoutInflater A16 = A16();
                                C18070vi.A0X(A16);
                                AnonymousClass92u r32 = r03.A00;
                                r32.BiK((C20112A7u) null, 0, (Integer) null, "payment_method_prompt");
                                View A002 = C20080A6g.A00(A16, viewGroup, r32.A0B, 0, false);
                                if (A002 != null) {
                                    viewGroup.addView(A002);
                                    viewGroup.setVisibility(0);
                                }
                            }
                            ScrollView scrollView = (ScrollView) C18070vi.A05(view, 2131429519);
                            scrollView.getViewTreeObserver().addOnScrollChangedListener(new C20304AFm((LinearLayout) C18070vi.A05(view, 2131430951), (RelativeLayout) C18070vi.A05(view, 2131427472), scrollView, AnonymousClass3MZ.A09(this).getDimension(2131168631)));
                            return;
                        }
                    }
                    C18070vi.A11("methodListAdapter");
                    throw null;
                }
                str = "paymentMethodPresenter";
            } else {
                str = "paymentsManager";
            }
        } else {
            str = "whatsAppLocale";
        }
        C18070vi.A11(str);
        throw null;
    }

    public String BUt(C20284AEs aEs) {
        C18070vi.A0d(aEs, 0);
        C186159dk r1 = this.A0A;
        if (r1 != null) {
            if (aEs instanceof AnonymousClass8pQ) {
                return "";
            }
            AnonymousClass92u r0 = r1.A00;
            String A062 = r0.A0O.A06(aEs, r0.A0j, false);
            if (A062 != null) {
                return A062;
            }
        }
        Context A14 = A14();
        C170278pb r02 = aEs.A08;
        C17960vV.A07(r02);
        if (!r02.A0A()) {
            return A14.getString(2131893673);
        }
        if (A8e.A03(A14, aEs) != null) {
            return A8e.A03(A14, aEs);
        }
        return "";
    }

    public String BUu(C20284AEs aEs) {
        C18070vi.A0d(aEs, 0);
        AnonymousClass00H r0 = this.A0J;
        if (r0 != null) {
            return AnonymousClass8BR.A0c(r0).A03(aEs, false);
        }
        C18070vi.A11("paymentMethodPresenter");
        throw null;
    }

    public boolean CLr(C20284AEs aEs) {
        C18070vi.A0d(aEs, 0);
        return false;
    }

    public boolean CMD() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.95z, X.9Yf] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.95x, X.9Yf] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.95y, X.9Yf] */
    /* JADX WARNING: type inference failed for: r0v37, types: [java.lang.Object, X.95x, X.9Yf] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment r5) {
        /*
            java.util.List r3 = r5.A0P
            r3.clear()
            boolean r0 = r5.A0L
            r4 = 1
            if (r0 == 0) goto L_0x0016
            r1 = 5
            X.95x r0 = new X.95x
            r0.<init>(r1)
            r0.A00 = r4
            r3.add(r0)
        L_0x0015:
            return r3
        L_0x0016:
            java.util.List r0 = r5.A0K
            java.lang.String r2 = "nativePaymentMethods"
            if (r0 == 0) goto L_0x0067
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 == 0) goto L_0x0059
            r0 = 2131893452(0x7f121ccc, float:1.942168E38)
            java.lang.String r1 = X.AnonymousClass3MY.A0n(r5, r0)
            X.95w r0 = new X.95w
            r0.<init>(r1)
            r3.add(r0)
            java.util.List r0 = r5.A0K
            if (r0 == 0) goto L_0x0067
            java.util.Iterator r4 = r0.iterator()
        L_0x0039:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x006b
            X.AEs r0 = X.AnonymousClass8BR.A0P(r4)
            X.AEs r2 = r5.A04
            X.960 r1 = new X.960
            r1.<init>(r0, r5)
            X.AEs r0 = r1.A01
            boolean r0 = X.C18070vi.A18(r0, r2)
            if (r0 == 0) goto L_0x0055
            r0 = 1
            r1.A00 = r0
        L_0x0055:
            r3.add(r1)
            goto L_0x0039
        L_0x0059:
            X.AEs r0 = r5.A04
            if (r0 == 0) goto L_0x005e
            r4 = 0
        L_0x005e:
            r0 = 4
            X.95y r1 = new X.95y
            r1.<init>(r0)
            r1.A00 = r4
            goto L_0x00bb
        L_0x0067:
            X.C18070vi.A11(r2)
            goto L_0x00c7
        L_0x006b:
            r0 = 19
            X.AFO r1 = new X.AFO
            r1.<init>(r5, r0)
            X.95u r0 = new X.95u
            r0.<init>(r1)
            r3.add(r0)
            X.9dk r2 = r5.A0A
            if (r2 == 0) goto L_0x009f
            android.view.LayoutInflater r1 = r5.A16()
            X.C18070vi.A0X(r1)
            X.92u r0 = r2.A00
            android.view.View r1 = r0.A5F(r1)
            if (r1 == 0) goto L_0x009f
            r0 = 2131429074(0x7f0b06d2, float:1.847981E38)
            X.C72463Mc.A13(r1, r0)
            r0 = 1
            X.AFP.A00(r1, r2, r0)
            X.95v r0 = new X.95v
            r0.<init>(r1)
            r3.add(r0)
        L_0x009f:
            X.9dk r1 = r5.A0A
            if (r1 == 0) goto L_0x00be
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x00c9
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x00c9
            X.92u r1 = r1.A00
            r0 = 2131893449(0x7f121cc9, float:1.9421675E38)
        L_0x00b0:
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x00be
            X.95w r1 = new X.95w
            r1.<init>(r0)
        L_0x00bb:
            r3.add(r1)
        L_0x00be:
            java.util.List r0 = r5.A0M
            if (r0 != 0) goto L_0x00cf
            java.lang.String r0 = "externalPaymentOptions"
            X.C18070vi.A11(r0)
        L_0x00c7:
            r0 = 0
            throw r0
        L_0x00c9:
            X.92u r1 = r1.A00
            r0 = 2131893450(0x7f121cca, float:1.9421677E38)
            goto L_0x00b0
        L_0x00cf:
            java.util.Iterator r4 = r0.iterator()
        L_0x00d3:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00f3
            X.AEs r0 = X.AnonymousClass8BR.A0P(r4)
            X.AEs r2 = r5.A04
            X.960 r1 = new X.960
            r1.<init>(r0, r5)
            X.AEs r0 = r1.A01
            boolean r0 = X.C18070vi.A18(r0, r2)
            if (r0 == 0) goto L_0x00ef
            r0 = 1
            r1.A00 = r0
        L_0x00ef:
            r3.add(r1)
            goto L_0x00d3
        L_0x00f3:
            boolean r0 = r5.A0O
            if (r0 == 0) goto L_0x0104
            r1 = 0
            r0 = 5
            X.95x r2 = new X.95x
            r2.<init>(r0)
            r2.A00 = r1
        L_0x0100:
            r3.add(r2)
            return r3
        L_0x0104:
            boolean r0 = r5.A0N
            if (r0 == 0) goto L_0x0015
            r1 = 0
            r0 = 6
            X.95z r2 = new X.95z
            r2.<init>(r0)
            r2.A00 = r1
            goto L_0x0100
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment.A00(com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment):java.util.List");
    }

    public static final void A01(HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment, int i) {
        C20112A7u a7u;
        AnonymousClass92u r1;
        C187399fk r5;
        String str;
        String str2;
        C183429Yf r12 = (C183429Yf) hybridPaymentMethodPickerFragment.A0P.get(i);
        if (r12 instanceof AnonymousClass960) {
            C20284AEs aEs = ((AnonymousClass960) r12).A01;
            hybridPaymentMethodPickerFragment.A04 = aEs;
            C187399fk r3 = hybridPaymentMethodPickerFragment.A0B;
            if (r3 != null) {
                if (!(aEs instanceof AnonymousClass8pQ)) {
                    AnonymousClass92u r13 = r3.A02;
                    if (AnonymousClass92u.A0d(aEs)) {
                        r3.A03.A28();
                        r13.A5k(aEs);
                        return;
                    }
                }
                r1 = r3.A02;
                ARR arr = r3.A00;
                PaymentBottomSheet paymentBottomSheet = r3.A03;
                HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment2 = r3.A01;
                if (r1 instanceof AnonymousClass92s) {
                    AnonymousClass92s r52 = (AnonymousClass92s) r1;
                    WaButtonWithLoader waButtonWithLoader = hybridPaymentMethodPickerFragment2.A01;
                    if (waButtonWithLoader != null) {
                        waButtonWithLoader.A02();
                    }
                    C20824Aa1 aa1 = new C20824Aa1(aEs, hybridPaymentMethodPickerFragment2, r52, paymentBottomSheet);
                    r52.A5t(arr, new C20816AZt(aEs, arr, r52, 2), new C20821AZy(hybridPaymentMethodPickerFragment2, r52, 1), aa1, paymentBottomSheet, C21447AkE.A00(hybridPaymentMethodPickerFragment2, 32));
                } else {
                    C18070vi.A0d(arr, 0);
                    r1.A5l(aEs, arr, (ARR) null, paymentBottomSheet);
                }
                a7u = r1.A0S.A08(aEs, (C20112A7u) null);
                a7u.A07("available_payment_methods", TextUtils.join(",", r3.A04));
            } else {
                return;
            }
        } else if (r12 instanceof C1768695y) {
            Fragment fragment = hybridPaymentMethodPickerFragment.A0E;
            C18070vi.A0z(fragment, "null cannot be cast to non-null type com.whatsapp.payments.ui.PaymentBottomSheet");
            AnonymousClass3MW.A1V(fragment);
            C187399fk r0 = hybridPaymentMethodPickerFragment.A0B;
            if (r0 != null) {
                r0.A02.A5m(r0.A00);
                return;
            }
            return;
        } else {
            if (r12 instanceof C1768595x) {
                C187399fk r32 = hybridPaymentMethodPickerFragment.A0B;
                if (r32 != null) {
                    r1 = r32.A02;
                    ARR arr2 = r32.A00;
                    HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment3 = r32.A01;
                    if (r1 instanceof AnonymousClass92s) {
                        AnonymousClass92s r4 = (AnonymousClass92s) r1;
                        WaButtonWithLoader waButtonWithLoader2 = hybridPaymentMethodPickerFragment3.A01;
                        if (waButtonWithLoader2 != null) {
                            waButtonWithLoader2.A02();
                        }
                        C21447AkE A002 = C21447AkE.A00(hybridPaymentMethodPickerFragment3, 32);
                        C20821AZy aZy = new C20821AZy(hybridPaymentMethodPickerFragment3, r4, 2);
                        r4.A5n(arr2, new C20815AZs(arr2, r4, 2), aZy, (PaymentBottomSheet) hybridPaymentMethodPickerFragment3.A19(), A002);
                    }
                    a7u = C20112A7u.A02();
                    a7u.A07("available_payment_methods", TextUtils.join(",", r32.A04));
                    str = "payment_method";
                    str2 = "hpp";
                } else {
                    return;
                }
            } else if ((r12 instanceof C1768795z) && (r5 = hybridPaymentMethodPickerFragment.A0B) != null) {
                r1 = r5.A02;
                HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment4 = r5.A01;
                if (r1 instanceof AnonymousClass92s) {
                    AnonymousClass92s r6 = (AnonymousClass92s) r1;
                    r6.A0F.getClass();
                    C17960vV.A0C(AnonymousClass000.A1a(r6.A0F));
                    C20933Abn abn = (C20933Abn) ((C20251ADj) r6.A0F.get(0)).A00;
                    abn.getClass();
                    C20932Abm abm = abn.A00;
                    DialogFragment dialogFragment = (DialogFragment) hybridPaymentMethodPickerFragment4.A19();
                    if (dialogFragment != null) {
                        dialogFragment.A28();
                    }
                    String str3 = abm.A02;
                    r6.CNh(AnonymousClass6X6.A00(r6, r6.A0E, C22941Dw.A00(r6.A07.A00), str3), 0);
                }
                a7u = C20112A7u.A02();
                a7u.A07("available_payment_methods", TextUtils.join(",", r5.A04));
                str = "payment_method";
                str2 = "payment_link";
            } else {
                return;
            }
            a7u.A07(str, str2);
        }
        r1.BiK(a7u, C17880vN.A0h(), C17880vN.A0l(), "payment_method_prompt");
    }

    public boolean CMH() {
        return AnonymousClass000.A1W(this.A0A);
    }

    public void A1r() {
        super.A1r();
        AnonymousClass00H r0 = this.A0H;
        if (r0 != null) {
            C17880vN.A0V(r0).unregisterObserver(this.A0Q);
        } else {
            C18070vi.A11("accountObservers");
            throw null;
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        Bundle A15 = A15();
        ArrayList parcelableArrayList = A15.getParcelableArrayList("arg_native_methods");
        C17960vV.A07(parcelableArrayList);
        C18070vi.A0X(parcelableArrayList);
        this.A0K = parcelableArrayList;
        ArrayList parcelableArrayList2 = A15.getParcelableArrayList("arg_external_methods");
        C17960vV.A07(parcelableArrayList2);
        C18070vi.A0X(parcelableArrayList2);
        this.A0M = parcelableArrayList2;
        this.A04 = (C20284AEs) A15.getParcelable("arg_selected_method");
        this.A0O = A15.getBoolean("arg_hpp_checkout_enabled");
        this.A0L = A15.getBoolean("arg_is_hpp_checkout_only");
        this.A0E = AnonymousClass4aU.A03(A15, "");
        this.A0N = A15.getBoolean("arg_has_merchant_configuration_payment_link");
        AnonymousClass00H r0 = this.A0H;
        if (r0 != null) {
            C17880vN.A0V(r0).registerObserver(this.A0Q);
        } else {
            C18070vi.A11("accountObservers");
            throw null;
        }
    }

    public /* synthetic */ int BUr(C20284AEs aEs) {
        return 0;
    }

    public void CMg(C20284AEs aEs, PaymentMethodRow paymentMethodRow) {
        C18070vi.A0h(aEs, paymentMethodRow);
        C186159dk r0 = this.A0A;
        if (r0 != null) {
            C20063A5m.A00(aEs, paymentMethodRow, r0.A00.A0M);
        }
    }
}
