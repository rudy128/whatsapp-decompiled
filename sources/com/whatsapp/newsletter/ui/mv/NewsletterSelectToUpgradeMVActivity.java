package com.whatsapp.newsletter.ui.mv;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1NN;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass7AS;
import X.AnonymousClass80U;
import X.AnonymousClass80V;
import X.AnonymousClass80W;
import X.AnonymousClass80X;
import X.AnonymousClass80Y;
import X.C000200d;
import X.C003401n;
import X.C108955ca;
import X.C108985cd;
import X.C109005cf;
import X.C112005km;
import X.C131306ks;
import X.C1423279a;
import X.C1595785b;
import X.C18070vi;
import X.C19880zA;
import X.C19890zB;
import X.C37961qT;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaTextView;

public final class NewsletterSelectToUpgradeMVActivity extends AnonymousClass1FY implements C1595785b {
    public ImageView A00;
    public LinearLayout A01;
    public RecyclerView A02;
    public RecyclerView A03;
    public C19880zA A04;
    public C131306ks A05;
    public WaTextView A06;
    public WaTextView A07;
    public WaTextView A08;
    public AnonymousClass1NN A09;
    public C112005km A0A;
    public C112005km A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public boolean A0F;

    public void A2y() {
        if (!this.A0F) {
            this.A0F = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A2 = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r1 = A0A2.A00;
            C109005cf.A0d(A0A2, r1, this);
            C109005cf.A0e(A0A2, r1, this, r1.A5A);
            this.A09 = (AnonymousClass1NN) A0A2.A2q.get();
            this.A05 = (C131306ks) A0K.A5C.get();
            this.A0C = C000200d.A00(A0A2.A7K);
            this.A04 = C19890zB.A00;
            this.A0D = C000200d.A00(A0K.A56);
            this.A0E = AnonymousClass3MW.A0s(A0A2);
        }
    }

    public final AnonymousClass00H A4b() {
        AnonymousClass00H r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1H();
        throw null;
    }

    public NewsletterSelectToUpgradeMVActivity(int i) {
        this.A0F = false;
        C1423279a.A00(this, 20);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass1NN r1 = this.A09;
        if (r1 != null) {
            r1.registerObserver(A4b().get());
            setContentView(2131624089);
            C131306ks r0 = this.A05;
            if (r0 != null) {
                this.A0A = r0.A00(this);
                this.A02 = (RecyclerView) AnonymousClass3MY.A0C(this, 2131436521);
                this.A07 = (WaTextView) AnonymousClass3MY.A0C(this, 2131436522);
                RecyclerView recyclerView = this.A02;
                if (recyclerView == null) {
                    C18070vi.A11("unverifiedNewsletterRecyclerView");
                    throw null;
                }
                C112005km r02 = this.A0A;
                if (r02 == null) {
                    C18070vi.A11("unverifiedNewsletterSelectToUpdateMVAdapter");
                    throw null;
                }
                recyclerView.setAdapter(r02);
                recyclerView.setItemAnimator((C37961qT) null);
                recyclerView.setLayoutManager(new LinearLayoutManager(AnonymousClass3MY.A04(recyclerView), 1, false));
                AnonymousClass7AS.A00(this, C108985cd.A0W(this).A02, new AnonymousClass80X(this), 1);
                C131306ks r03 = this.A05;
                if (r03 != null) {
                    this.A0B = r03.A00(this);
                    RecyclerView recyclerView2 = (RecyclerView) AnonymousClass3MY.A0C(this, 2131436707);
                    this.A03 = recyclerView2;
                    if (recyclerView2 == null) {
                        C18070vi.A11("verifiedNewsletterRecyclerView");
                        throw null;
                    }
                    C112005km r04 = this.A0B;
                    if (r04 == null) {
                        C18070vi.A11("verifiedNewsletterSelectToUpdateMVAdapter");
                        throw null;
                    }
                    recyclerView2.setAdapter(r04);
                    recyclerView2.setItemAnimator((C37961qT) null);
                    recyclerView2.setLayoutManager(new LinearLayoutManager(AnonymousClass3MY.A04(recyclerView2), 1, false));
                    AnonymousClass7AS.A00(this, C108985cd.A0W(this).A03, new AnonymousClass80Y(this), 1);
                    this.A01 = (LinearLayout) AnonymousClass3MY.A0H(this, 2131433055);
                    this.A00 = (ImageView) AnonymousClass3MY.A0H(this, 2131433056);
                    this.A06 = (WaTextView) AnonymousClass3MY.A0H(this, 2131433057);
                    this.A08 = (WaTextView) AnonymousClass3MY.A0H(this, 2131436708);
                    AnonymousClass7AS.A00(this, C108985cd.A0W(this).A01, new AnonymousClass80U(this), 1);
                    AnonymousClass7AS.A00(this, C108985cd.A0W(this).A00, new AnonymousClass80V(this), 1);
                    AnonymousClass7AS.A00(this, C108985cd.A0W(this).A03, new AnonymousClass80W(this), 1);
                    LinearLayout linearLayout = this.A01;
                    if (linearLayout == null) {
                        C18070vi.A11("createButton");
                        throw null;
                    }
                    AnonymousClass3Ma.A19(linearLayout, this, 20);
                    C003401n A0K = AnonymousClass3MY.A0K(this, AnonymousClass3Ma.A0G(this));
                    if (A0K != null) {
                        A0K.A0Y(true);
                        A0K.A0W(true);
                        A0K.A0M(2131892807);
                    }
                    C108985cd.A0W(this).A0U();
                    C19880zA r12 = this.A04;
                    if (r12 == null) {
                        C18070vi.A11("subscriptionAnalyticsManager");
                        throw null;
                    } else if (r12.A07()) {
                        r12.A03();
                        throw AnonymousClass000.A0s("logMetaVerifiedChannelAction");
                    }
                } else {
                    C18070vi.A11("factory");
                    throw null;
                }
            } else {
                C18070vi.A11("factory");
                throw null;
            }
        } else {
            C18070vi.A11("conversationObservers");
            throw null;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass1NN r1 = this.A09;
        if (r1 != null) {
            r1.unregisterObserver(A4b().get());
            C108985cd.A0W(this).A02.A09(this);
            C108985cd.A0W(this).A03.A09(this);
            C108985cd.A0W(this).A01.A09(this);
            C108985cd.A0W(this).A00.A09(this);
            return;
        }
        C18070vi.A11("conversationObservers");
        throw null;
    }

    public NewsletterSelectToUpgradeMVActivity() {
        this(0);
    }
}
