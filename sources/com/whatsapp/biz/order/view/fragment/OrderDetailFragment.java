package com.whatsapp.biz.order.view.fragment;

import X.A6X;
import X.A8Q;
import X.AH9;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass122;
import X.AnonymousClass1DT;
import X.AnonymousClass1HF;
import X.AnonymousClass1LU;
import X.AnonymousClass1OZ;
import X.AnonymousClass1PM;
import X.AnonymousClass1QJ;
import X.AnonymousClass1R2;
import X.AnonymousClass1Xr;
import X.AnonymousClass205;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aU;
import X.AnonymousClass8BR;
import X.AnonymousClass9VG;
import X.AnonymousClass9VH;
import X.AnonymousClass9VI;
import X.C108945cZ;
import X.C108955ca;
import X.C161518Fk;
import X.C161838Hy;
import X.C167908hy;
import X.C17880vN;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C182979Wl;
import X.C183909a6;
import X.C187189fP;
import X.C188669hn;
import X.C191899nN;
import X.C19880zA;
import X.C19949A0g;
import X.C20004A2u;
import X.C20005A2v;
import X.C20114A7x;
import X.C20334AGq;
import X.C21450AkH;
import X.C21452AkJ;
import X.C21459AkQ;
import X.C26911Ty;
import X.C28931bI;
import X.C32951i1;
import X.C36251na;
import X.C37121p0;
import X.C37131p1;
import X.C49962Sp;
import X.C72453Mb;
import X.C825348i;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Hashtable;
import java.util.concurrent.Future;

public class OrderDetailFragment extends Hilt_OrderDetailFragment {
    public static boolean A0Z;
    public ProgressBar A00;
    public C19880zA A01;
    public C19880zA A02;
    public AnonymousClass9VG A03;
    public AnonymousClass9VH A04;
    public AnonymousClass9VI A05;
    public AnonymousClass11S A06;
    public WaTextView A07;
    public C20114A7x A08;
    public A8Q A09;
    public C191899nN A0A;
    public C161838Hy A0B;
    public C161518Fk A0C;
    public AnonymousClass1PM A0D;
    public C32951i1 A0E;
    public AnonymousClass11P A0F;
    public AnonymousClass122 A0G;
    public C18030ve A0H;
    public AnonymousClass1LU A0I;
    public UserJid A0J;
    public UserJid A0K;
    public AnonymousClass1QJ A0L;
    public AnonymousClass1R2 A0M;
    public C20004A2u A0N;
    public AnonymousClass205 A0O;
    public A6X A0P;
    public C28931bI A0Q;
    public AnonymousClass10I A0R;
    public WDSButton A0S;
    public AnonymousClass00H A0T;
    public AnonymousClass00H A0U;
    public AnonymousClass00H A0V;
    public AnonymousClass00H A0W;
    public String A0X;
    public C20005A2v A0Y;

    /* JADX WARNING: type inference failed for: r3v0, types: [androidx.fragment.app.Fragment, com.whatsapp.biz.order.view.fragment.Hilt_OrderDetailFragment, com.whatsapp.biz.order.view.fragment.OrderDetailFragment] */
    public static OrderDetailFragment A00(UserJid userJid, UserJid userJid2, AnonymousClass205 r6, String str, String str2, String str3) {
        ? hilt_OrderDetailFragment = new Hilt_OrderDetailFragment();
        Bundle A0D2 = C17880vN.A0D();
        AnonymousClass4aU.A0A(A0D2, r6);
        A0D2.putParcelable("extra_key_seller_jid", userJid);
        A0D2.putParcelable("extra_key_buyer_jid", userJid2);
        A0D2.putString("extra_key_order_id", str);
        A0D2.putString("extra_key_token", str2);
        A0D2.putBoolean("extra_key_enable_create_order", false);
        A0D2.putBoolean("extra_is_new_instance", true);
        A0D2.putString("extra_key_catalog_type", str3);
        hilt_OrderDetailFragment.A1R(A0D2);
        return hilt_OrderDetailFragment;
    }

    public void A1z(Bundle bundle) {
        this.A0N.A01(774769843, "order_view_tag", "OrderDetailFragment");
        super.A1z(bundle);
        this.A0Y = C20005A2v.A00(this.A0A, this.A0U);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object obj;
        View inflate = layoutInflater.inflate(2131625383, viewGroup, false);
        AnonymousClass3MZ.A1I(inflate.findViewById(2131433313), this, 15);
        this.A00 = (ProgressBar) AnonymousClass1HF.A06(inflate, 2131433318);
        this.A0Q = C72453Mb.A0s(inflate, 2131432672);
        RecyclerView A0U2 = C108945cZ.A0U(inflate, 2131433319);
        A0U2.A0R = true;
        Parcelable parcelable = A15().getParcelable("extra_key_seller_jid");
        C17960vV.A07(parcelable);
        this.A0K = (UserJid) parcelable;
        A0Z = A15().getBoolean("extra_is_new_instance");
        AnonymousClass9VI r4 = this.A05;
        C20005A2v a2v = this.A0Y;
        UserJid userJid = this.A0K;
        C36251na r5 = r4.A00;
        AnonymousClass10E r42 = r5.A02;
        C161838Hy r8 = new C161838Hy((AnonymousClass9VH) r5.A01.A0B.get(), a2v, this, AnonymousClass10E.A6Q(r42), AnonymousClass10E.A8r(r42), userJid);
        this.A0B = r8;
        A0U2.setAdapter(r8);
        AnonymousClass1Xr.A05(A0U2, true);
        inflate.setMinimumHeight(C49962Sp.A00(A1D()));
        Parcelable parcelable2 = A15().getParcelable("extra_key_buyer_jid");
        C17960vV.A07(parcelable2);
        this.A0J = (UserJid) parcelable2;
        this.A0X = C108955ca.A0s(A15(), "extra_key_order_id");
        A15().getString("extra_key_catalog_type");
        String A0s = C108955ca.A0s(A15(), "extra_key_token");
        AnonymousClass205 A032 = AnonymousClass4aU.A03(A15(), "");
        this.A0O = A032;
        String str = this.A0X;
        C161518Fk r43 = (C161518Fk) AnonymousClass8BR.A0C(new AH9(this.A03, this.A0K, A032, A0s, str), this).A00(C161518Fk.class);
        this.A0C = r43;
        r43.A02.A0A(A1G(), new C20334AGq(this, 37));
        this.A0C.A01.A0A(A1G(), new C20334AGq(this, 38));
        this.A07 = AnonymousClass3MW.A0T(inflate, 2131433322);
        C161518Fk r44 = this.A0C;
        if (r44.A06.A0O(r44.A0C)) {
            this.A07.setText(2131894937);
        } else {
            this.A0C.A03.A0A(A1G(), new C20334AGq(this, 39));
            C161518Fk r82 = this.A0C;
            UserJid userJid2 = this.A0K;
            C18070vi.A0d(userJid2, 0);
            C21450AkH.A01(r82.A0E, r82, userJid2, 29);
        }
        C161518Fk r45 = this.A0C;
        C188669hn r11 = r45.A08;
        UserJid userJid3 = r45.A0C;
        String str2 = r45.A0F;
        String str3 = r45.A0G;
        Object obj2 = ((C37121p0) r11.A0B.get()).A00.get(str2);
        if (obj2 != null) {
            AnonymousClass1DT r46 = r11.A00;
            if (r46 != null) {
                r46.A0E(obj2);
            }
        } else {
            C187189fP r17 = new C187189fP(userJid3, str2, str3, r11.A03, r11.A02);
            C20004A2u a2u = r11.A08;
            AnonymousClass1OZ A0U3 = C17880vN.A0U(r11.A0A);
            C26911Ty r15 = r11.A04;
            C19949A0g a0g = r11.A07;
            AnonymousClass10I r52 = r11.A09;
            C167908hy r14 = new C167908hy(r15, (C182979Wl) r11.A0D.get(), r17, (C37131p1) r11.A0C.get(), r11.A06, a0g, A0U3, a2u, r52);
            C183909a6 r9 = r11.A05;
            synchronized (r9) {
                Hashtable hashtable = r9.A00;
                obj = (Future) hashtable.get(str2);
                if (obj == null) {
                    r14.A06.CGN(new C21452AkJ(29, r14.A03.A0B(), r14));
                    obj = r14.A05;
                    hashtable.put(str2, obj);
                    C21459AkQ.A01(r9.A01, r9, obj, str2, 32);
                }
            }
            C21450AkH.A01(r52, r11, obj, 28);
        }
        if (A15().getBoolean("extra_key_enable_create_order")) {
            View A062 = AnonymousClass1HF.A06(inflate, 2131428589);
            A062.setVisibility(0);
            TextView A0J2 = AnonymousClass3MW.A0J(A062, 2131429716);
            this.A0C.A00.A0A(A1G(), new C20334AGq(A0J2, 40));
            A0J2.setOnClickListener(new C825348i(1, A0s, this));
            C18030ve r53 = this.A0H;
            C18070vi.A0d(r53, 0);
            int A002 = C18020vd.A00(C18040vf.A02, r53, 4248);
            int i = 2131889092;
            if (A002 != 2) {
                i = 2131889093;
                if (A002 != 3) {
                    i = 2131889091;
                }
            }
            A0J2.setText(i);
            View A063 = AnonymousClass1HF.A06(A062, 2131429841);
            A063.setVisibility(0);
            AnonymousClass3Ma.A1C(A063, this, 36);
        }
        this.A0E.A0F(this.A0K, 0);
        return inflate;
    }

    public void A1r() {
        super.A1r();
        this.A0Y.A02();
        this.A0N.A06("order_view_tag", false);
    }
}
