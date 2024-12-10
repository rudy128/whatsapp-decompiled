package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.util.ArrayList;

/* renamed from: X.3sq  reason: invalid class name and case insensitive filesystem */
public final class C78463sq extends AnonymousClass3uP {
    public C19880zA A00;
    public C19880zA A01;
    public C19880zA A02;
    public C24671Lf A03;
    public C27201Vd A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public Integer A09 = AnonymousClass00R.A01;
    public boolean A0A;
    public Integer A0B = AnonymousClass00R.A00;
    public boolean A0C;
    public boolean A0D;
    public final LinearLayout A0E = ((LinearLayout) C18070vi.A05(this, 2131432993));
    public final TextView A0F = AnonymousClass3Ma.A0E(this, 2131432983);
    public final TextView A0G = AnonymousClass3Ma.A0E(this, 2131432984);
    public final C436420i A0H;
    public final C28931bI A0I = C28931bI.A00(this, 2131427622);
    public final C28931bI A0J = C28931bI.A00(this, 2131427654);
    public final WDSButton A0K = ((WDSButton) C18070vi.A05(this, 2131435372));
    public final WDSButton A0L = ((WDSButton) C18070vi.A05(this, 2131435403));
    public final WDSProfilePhoto A0M = ((WDSProfilePhoto) C18070vi.A05(this, 2131433025));
    public final Drawable A0N;
    public final C23581Gv A0O = new C94144k7(this);
    public final C18100vl A0P = AnonymousClass1DF.A01(new C102345Gc(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78463sq(Context context, C108875cR r4, C436420i r5) {
        super(context, r4, r5);
        C18070vi.A0d(context, 1);
        A1M();
        this.A0H = r5;
        Drawable A002 = C24261Jm.A00(context, 2131231078);
        C17960vV.A07(A002);
        C18070vi.A0X(A002);
        this.A0N = A002;
        setClickable(false);
        this.A2e = true;
        this.A2i = false;
        setOnClickListener((View.OnClickListener) null);
        A01();
    }

    public static final void setupShareToMyStatusButton$lambda$14(C78463sq r9, C46162Dk r10, View view) {
        int i;
        boolean A17 = C18070vi.A17(r9, r10);
        ((AnonymousClass74D) r9.getNewsletterLogging().get()).A0D(r10.A0M(), (Integer) null, 2, A17 ? 1 : 0);
        if (C18020vd.A05(C18040vf.A02, r9.A0F, 6445)) {
            C98714rb.A00(r9.A1X, r10, r9, r9.getContext(), 8);
            return;
        }
        String str = r10.A0R;
        if (str != null) {
            i = 2131892897;
        } else {
            str = r10.A0S;
            if (str != null) {
                i = 2131892898;
            } else {
                return;
            }
        }
        AnonymousClass1FY baseActivity = r9.getBaseActivity();
        Object[] objArr = new Object[2];
        objArr[0] = r10.A0T;
        String A10 = AnonymousClass3Ma.A10(baseActivity, str, objArr, A17, i);
        r9.getWaIntents().get();
        r9.getBaseActivity().startActivity(AnonymousClass1LU.A0T(r9.getBaseActivity(), (AnonymousClass77K) null, 17, A10), (Bundle) null);
    }

    public static final void setupShareToMyStatusButton$lambda$14$lambda$13$lambda$12(Context context, ArrayList arrayList, AnonymousClass73D r5, C78463sq r6) {
        C18070vi.A0e(arrayList, 1, r5);
        C18070vi.A0d(r6, 3);
        C18070vi.A0b(context);
        C139416yo r1 = new C139416yo(context);
        r1.A01 = 3;
        r1.A0I = arrayList;
        Bundle A0D2 = C17880vN.A0D();
        AnonymousClass73D.A01(A0D2, r5);
        r1.A08 = A0D2;
        r1.A0D = C29671cg.A00.getRawString();
        r1.A0P = true;
        r1.A0K = true;
        r1.A02 = 25;
        r6.getBaseActivity().startActivity(r1.A01(), (Bundle) null);
    }

    public Drawable A1Q(int i, int i2, boolean z) {
        if (i == 1) {
            return this.A0N;
        }
        Drawable A1Q = super.A1Q(i, i2, z);
        C18070vi.A0X(A1Q);
        return A1Q;
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    public final void setBenefitsAccessManager(C19880zA r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setContactObservers(C24671Lf r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setContactPhotos(C27201Vd r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setNewsletterLogging(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setNewsletterPerfTracker(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setNewsletterStatusMediaGenerator(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setSubscriptionAnalyticsManager(C19880zA r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setSubscriptionManager(C19880zA r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setWaIntents(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public static final void A02(C78463sq r4) {
        int i;
        int intValue = r4.A0B.intValue();
        if (intValue == 0) {
            i = 2131892501;
        } else if (intValue == 1) {
            i = 2131892502;
        } else if (intValue == 2) {
            i = 2131892503;
        } else if (intValue == 3) {
            i = 2131892504;
        } else {
            throw AnonymousClass3MW.A14();
        }
        TextView textView = r4.A0F;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(r4.getContext().getString(i));
        A10.append(' ');
        textView.setText(AnonymousClass000.A0y(r4.getContext().getString(2131892499), A10));
    }

    private final C46162Dk getNewsletterInfo() {
        C29691ci A0A2 = this.A0E.A0A(this.A0H.A0v.A00);
        if (A0A2 instanceof C46162Dk) {
            return (C46162Dk) A0A2;
        }
        return null;
    }

    private final AnonymousClass4ZR getTransitionNames() {
        return (AnonymousClass4ZR) this.A0P.getValue();
    }

    public static /* synthetic */ void setupNewsletterIcon$default(C78463sq r1, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        r1.setupNewsletterIcon(z);
    }

    public void A1M() {
        if (!this.A0C) {
            this.A0C = true;
            C27691Xc A0O2 = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r2 = A0O2.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r2, A0O2, this);
            AnonymousClass10G r3 = r2.A00;
            AnonymousClass3uQ.A16(r3, this);
            AnonymousClass3uQ.A0w(A0n, r2, r3, this);
            AnonymousClass3uQ.A12(r2, r3, this);
            AnonymousClass3uQ.A0y(A0n, r2, this, BE8.A0d(r2));
            AnonymousClass3uQ.A13(r2, r3, this, r2.ABq);
            AnonymousClass3uQ.A0x(A0n, r2, r3, this, r2.AIy);
            C19890zB r1 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r1, r2, r3, A0O2, this);
            AnonymousClass3uQ.A11(r2, r3, this);
            AnonymousClass3uQ.A15(r2, this);
            AnonymousClass3uQ.A0s(r1, A0n, r2, r3, this);
            AnonymousClass3uQ.A0u(r1, r2, r3, A0O2, this);
            AnonymousClass3uQ.A0t(r1, A0n, r2, A0O2, this);
            AnonymousClass3uQ.A10(r2, r3, this);
            AnonymousClass3uQ.A0z(r2, r3, A0O2, this, AnonymousClass3uQ.A0o(r2));
            this.A00 = r1;
            this.A03 = (C24671Lf) r2.A2g.get();
            this.A04 = BE9.A0Y(r2);
            this.A05 = C000200d.A00(r2.A7M);
            this.A06 = C000200d.A00(r2.A7R);
            this.A07 = C000200d.A00(r3.AE1);
            this.A01 = r1;
            this.A02 = (C19880zA) r2.A7k.get();
            this.A08 = C000200d.A00(r2.ABd);
        }
    }

    public final C19880zA getBenefitsAccessManager() {
        C19880zA r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("benefitsAccessManager");
        throw null;
    }

    public final C24671Lf getContactObservers() {
        C24671Lf r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactObservers");
        throw null;
    }

    public final C27201Vd getContactPhotos() {
        C27201Vd r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactPhotos");
        throw null;
    }

    public final AnonymousClass00H getNewsletterLogging() {
        AnonymousClass00H r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("newsletterLogging");
        throw null;
    }

    public final AnonymousClass00H getNewsletterPerfTracker() {
        AnonymousClass00H r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("newsletterPerfTracker");
        throw null;
    }

    public final AnonymousClass00H getNewsletterStatusMediaGenerator() {
        AnonymousClass00H r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("newsletterStatusMediaGenerator");
        throw null;
    }

    public final C19880zA getSubscriptionAnalyticsManager() {
        C19880zA r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("subscriptionAnalyticsManager");
        throw null;
    }

    public final C19880zA getSubscriptionManager() {
        C19880zA r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("subscriptionManager");
        throw null;
    }

    public final AnonymousClass00H getWaIntents() {
        AnonymousClass00H r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waIntents");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r1 <= 0) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01() {
        /*
            r7 = this;
            X.2Dk r0 = r7.getNewsletterInfo()
            if (r0 == 0) goto L_0x011f
            boolean r0 = r0.A0P()
            if (r0 == 0) goto L_0x011f
            A03(r7)
            r5 = 0
            r7.setupNewsletterIcon(r5)
            X.2Dk r0 = r7.getNewsletterInfo()
            if (r0 == 0) goto L_0x002d
            android.widget.TextView r4 = r7.A0G
            android.content.Context r3 = r7.getContext()
            r2 = 2131892505(0x7f121919, float:1.941976E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            java.lang.String r0 = r0.A0T
            r1[r5] = r0
            X.AnonymousClass3MY.A0y(r3, r4, r1, r2)
        L_0x002d:
            A02(r7)
            X.2Dk r3 = r7.getNewsletterInfo()
            if (r3 == 0) goto L_0x0052
            X.1bI r2 = r7.A0I
            java.lang.String r0 = r3.A0Q
            if (r0 == 0) goto L_0x0044
            int r1 = r0.length()
            r0 = 8
            if (r1 > 0) goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            r2.A04(r0)
            r1 = 19
            X.4dU r0 = new X.4dU
            r0.<init>(r7, r3, r1)
            r2.A05(r0)
        L_0x0052:
            X.2Dk r2 = r7.getNewsletterInfo()
            if (r2 == 0) goto L_0x005f
            com.whatsapp.wds.components.button.WDSButton r1 = r7.A0K
            r0 = 16
            X.C90074dU.A01(r1, r7, r2, r0)
        L_0x005f:
            X.2Dk r2 = r7.getNewsletterInfo()
            if (r2 == 0) goto L_0x006c
            com.whatsapp.wds.components.button.WDSButton r1 = r7.A0L
            r0 = 17
            X.C90074dU.A01(r1, r7, r2, r0)
        L_0x006c:
            X.2Dk r2 = r7.getNewsletterInfo()
            if (r2 == 0) goto L_0x00b7
            X.0ve r3 = r7.A0F
            r1 = 6618(0x19da, float:9.274E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            r3 = 8
            if (r0 == 0) goto L_0x0119
            X.00H r0 = r7.A2B
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.1c4 r0 = (X.AnonymousClass1c4) r0
            boolean r0 = r2.A0S(r0)
            if (r0 != 0) goto L_0x0119
            X.00H r0 = r7.A2B
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.1c4 r0 = (X.AnonymousClass1c4) r0
            boolean r0 = r2.A0R(r0)
            if (r0 != 0) goto L_0x0119
            boolean r0 = r2.A0s
            if (r0 != 0) goto L_0x0119
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x0119
            X.9IW r1 = r2.A05
            X.9IW r0 = X.AnonymousClass9IW.VERIFIED
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            if (r0 != 0) goto L_0x0119
            X.10I r1 = r7.A1X
            r0 = 21
            X.C98814rl.A00(r1, r7, r2, r0)
        L_0x00b7:
            boolean r0 = X.AnonymousClass745.A00
            if (r0 == 0) goto L_0x0118
            X.1FY r6 = r7.getBaseActivity()
            android.view.Window r4 = r6.getWindow()
            X.C18070vi.A0X(r4)
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "circular_transition"
            boolean r0 = r1.getBooleanExtra(r0, r5)
            r3 = 1
            if (r0 == 0) goto L_0x00f7
            r0 = 12
            r4.requestFeature(r0)
            X.BGt r2 = new X.BGt
            r2.<init>(r3, r5)
            X.4ZR r1 = new X.4ZR
            r1.<init>(r6)
            r0 = 2131899529(0x7f123489, float:1.9434007E38)
            java.lang.String r0 = r1.A02(r0)
            r2.addTarget(r0)
            r4.setSharedElementEnterTransition(r2)
            X.3hW r0 = new X.3hW
            r0.<init>(r7, r3)
            r2.addListener(r0)
        L_0x00f7:
            android.transition.Fade r1 = new android.transition.Fade
            r1.<init>()
            r0 = 16908335(0x102002f, float:2.387736E-38)
            r1.excludeTarget(r0, r3)
            r0 = 16908336(0x1020030, float:2.3877364E-38)
            r1.excludeTarget(r0, r3)
            r4.setReturnTransition(r1)
            r4.setEnterTransition(r1)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.addFlags(r0)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r4.clearFlags(r0)
        L_0x0118:
            return
        L_0x0119:
            X.1bI r0 = r7.A0J
            r0.A04(r3)
            goto L_0x00b7
        L_0x011f:
            android.widget.TextView r0 = r7.A0G
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r7.A0F
            r0.setVisibility(r1)
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = r7.A0M
            r0.setVisibility(r1)
            X.1bI r0 = r7.A0I
            r0.A04(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r7.A0K
            r0.setVisibility(r1)
            android.widget.LinearLayout r2 = r7.A0E
            r2.setVisibility(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r7.A0L
            r0.setVisibility(r1)
            r1 = 0
            r2.setPadding(r1, r1, r1, r1)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r1, r1)
            r7.setLayoutParams(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78463sq.A01():void");
    }

    public static final void A03(C78463sq r3) {
        Integer num;
        C46162Dk newsletterInfo = r3.getNewsletterInfo();
        if (newsletterInfo != null) {
            String str = newsletterInfo.A0Q;
            if (str != null && str.length() == 0 && newsletterInfo.A0V == null) {
                num = AnonymousClass00R.A00;
            } else if (str != null && str.length() == 0) {
                num = AnonymousClass00R.A0C;
            } else if (newsletterInfo.A0V == null) {
                num = AnonymousClass00R.A01;
            } else {
                num = AnonymousClass00R.A0N;
            }
            r3.A0B = num;
        }
    }

    public static final void A04(C78463sq r4, C46162Dk r5) {
        if (r4.getSubscriptionAnalyticsManager().A07()) {
            r4.getSubscriptionAnalyticsManager().A03();
            throw AnonymousClass000.A0s("logMetaVerifiedChannelAction");
        }
        AnonymousClass1FY baseActivity = r4.getBaseActivity();
        r4.getWaIntents().get();
        baseActivity.startActivityForResult(AnonymousClass1LU.A15(AnonymousClass3MY.A04(r4), r5.A0M(), 6), 1054, (Bundle) null);
        r4.A09 = AnonymousClass00R.A00;
    }

    /* access modifiers changed from: private */
    public final AnonymousClass1FY getBaseActivity() {
        Activity A012 = AnonymousClass1L9.A01(getContext(), AnonymousClass01E.class);
        C18070vi.A0z(A012, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
        return (AnonymousClass1FY) A012;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        if (r8.A0M != X.AnonymousClass9IZ.META_VERIFIED_SUBSCRIPTION) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setupAddNewsletterDescriptionButton$lambda$9(X.C78463sq r7, X.C46162Dk r8, android.view.View r9) {
        /*
            X.C18070vi.A0h(r7, r8)
            X.00H r0 = r7.getNewsletterPerfTracker()
            java.lang.Object r3 = r0.get()
            X.A6Q r3 = (X.A6Q) r3
            X.0ve r2 = r3.A01
            r1 = 11284(0x2c14, float:1.5812E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x008f
            r0 = 2
            java.lang.Integer r4 = X.A6Q.A01(r3, r0)
        L_0x001f:
            X.9IW r1 = r8.A05
            X.9IW r0 = X.AnonymousClass9IW.VERIFIED
            if (r1 != r0) goto L_0x002c
            X.9IZ r1 = r8.A0M
            X.9IZ r0 = X.AnonymousClass9IZ.META_VERIFIED_SUBSCRIPTION
            r2 = 1
            if (r1 == r0) goto L_0x002d
        L_0x002c:
            r2 = 0
        L_0x002d:
            X.00H r0 = r7.getWaIntents()
            r0.get()
            android.content.Context r1 = X.AnonymousClass3MY.A04(r7)
            X.1ch r6 = r8.A0M()
            if (r2 == 0) goto L_0x0073
            r5 = 6
            java.lang.String r2 = "jid"
            r0 = 1
            X.C18070vi.A0d(r6, r0)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.whatsapp.newsletter.ui.mv.NewsletterEditMVActivity"
            r3.setClassName(r1, r0)
            java.lang.String r0 = r6.getRawString()
            r3.putExtra(r2, r0)
            java.lang.String r0 = "mv_referral_surface"
            r3.putExtra(r0, r5)
        L_0x005f:
            java.lang.String r0 = "log_instance_key"
            r3.putExtra(r0, r4)
            X.1FY r2 = r7.getBaseActivity()
            r1 = 0
            r0 = 1052(0x41c, float:1.474E-42)
            r2.startActivityForResult(r3, r0, r1)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r7.A09 = r0
            return
        L_0x0073:
            java.lang.String r2 = "jid"
            r0 = 1
            X.C18070vi.A0d(r6, r0)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.whatsapp.newsletter.ui.NewsletterEditDescriptionActivity"
            r3.setClassName(r1, r0)
            java.lang.String r0 = r6.getRawString()
            r3.putExtra(r2, r0)
            goto L_0x005f
        L_0x008f:
            r4 = 0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78463sq.setupAddNewsletterDescriptionButton$lambda$9(X.3sq, X.2Dk, android.view.View):void");
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setupAddVerifiedBadgeButton$lambda$5(X.C78463sq r7, X.C46162Dk r8) {
        /*
            boolean r6 = X.C18070vi.A16(r7, r8)
            X.1CJ r0 = r7.A0E
            java.util.Collection r0 = r0.A0H()
            if (r0 == 0) goto L_0x0054
            java.util.ArrayList r3 = X.C29351c6.A0D(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0014:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C46162Dk
            if (r0 != 0) goto L_0x0023
            r1 = 0
        L_0x0023:
            r3.add(r1)
            goto L_0x0014
        L_0x0027:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r4 = r3.iterator()
        L_0x002f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.2Dk r2 = (X.C46162Dk) r2
            if (r2 == 0) goto L_0x002f
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x002f
            X.9IW r1 = r2.A05
            X.9IW r0 = X.AnonymousClass9IW.VERIFIED
            if (r1 != r0) goto L_0x002f
            X.9IZ r1 = r2.A0M
            X.9IZ r0 = X.AnonymousClass9IZ.META_VERIFIED_SUBSCRIPTION
            if (r1 != r0) goto L_0x002f
            r5.add(r3)
            goto L_0x002f
        L_0x0054:
            X.0wS r5 = X.C18460wS.A00
        L_0x0056:
            X.0zA r0 = r7.getBenefitsAccessManager()
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x006e
            X.0zA r0 = r7.getBenefitsAccessManager()
            r0.A03()
            java.lang.String r0 = "getLimit"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x006e:
            int r0 = r5.size()
            if (r0 < r6) goto L_0x007c
            X.1bI r1 = r7.A0J
            r0 = 8
            r1.A04(r0)
            return
        L_0x007c:
            X.0zA r0 = r7.getSubscriptionManager()
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0094
            X.0zA r0 = r7.getSubscriptionManager()
            r0.A03()
            java.lang.String r0 = "isMetaVerifiedSubscriptionActive"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0094:
            X.1KB r1 = r7.A0S
            X.4rl r0 = new X.4rl
            r0.<init>(r7, r8)
            r1.A0J(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78463sq.setupAddVerifiedBadgeButton$lambda$5(X.3sq, X.2Dk):void");
    }

    public static final void setupAddVerifiedBadgeButton$lambda$5$lambda$4$lambda$3(C78463sq r5, C46162Dk r6, View view) {
        C18070vi.A0h(r5, r6);
        C73203Rj A002 = AnonymousClass4a6.A00(r5.getBaseActivity());
        A002.A0E(2131892863);
        A002.A0D(2131892861);
        A002.A0e(r5.getBaseActivity(), new C91474fk(4), 2131898766);
        A002.A0g(r5.getBaseActivity(), new C91494fm(r6, r5, 11), 2131892862);
        A002.create().show();
    }

    private final void setupNewsletterIcon(boolean z) {
        C46162Dk newsletterInfo = getNewsletterInfo();
        if (newsletterInfo != null) {
            C37451pZ A062 = getContactPhotos().A06(getContext(), "newsletter-admin-context-card");
            AnonymousClass1E7 A012 = this.A0w.A01(newsletterInfo.A08());
            int i = 2131169508;
            if (z) {
                i = 2131169504;
            }
            int A022 = AnonymousClass3Ma.A02(this, i);
            WDSProfilePhoto wDSProfilePhoto = this.A0M;
            A062.A0A(wDSProfilePhoto, A012, A022);
            if (!this.A0D) {
                this.A0D = true;
                getContactObservers().registerObserver(this.A0O);
            }
            AnonymousClass1Y5.A07(wDSProfilePhoto, "Button");
            AnonymousClass1Y5.A02(wDSProfilePhoto, 2131892493);
            AnonymousClass3MY.A0w(getContext(), wDSProfilePhoto, 2131892494);
            if (newsletterInfo.A0V != null) {
                wDSProfilePhoto.setProfileBadge((C39241sk) null);
                wDSProfilePhoto.setOnClickListener((View.OnClickListener) null);
                wDSProfilePhoto.setClickable(false);
                return;
            }
            if (wDSProfilePhoto.A04 == null) {
                wDSProfilePhoto.setProfileBadge(new C39291sp());
            }
            wDSProfilePhoto.setClickable(true);
            C90074dU.A01(wDSProfilePhoto, this, newsletterInfo, 18);
        }
    }

    public static final void setupNewsletterIcon$lambda$0(C78463sq r11, C46162Dk r12, View view) {
        int i;
        C18070vi.A0h(r11, r12);
        AnonymousClass1FY baseActivity = r11.getBaseActivity();
        if (!r11.A0A) {
            int statusBarColor = baseActivity.getWindow().getStatusBarColor();
            if (AnonymousClass112.A04()) {
                i = baseActivity.getWindow().getNavigationBarColor();
            } else {
                i = 0;
            }
            C29681ch A0M2 = r12.A0M();
            r11.getWaIntents().get();
            AnonymousClass1FY baseActivity2 = r11.getBaseActivity();
            C18070vi.A0d(baseActivity2, 0);
            C18070vi.A0d(A0M2, 1);
            Intent intent = new Intent();
            intent.setClassName(baseActivity2.getPackageName(), "com.whatsapp.newsletter.ui.profilephoto.ViewNewsletterProfilePhoto");
            intent.putExtra("jid", A0M2.getRawString());
            intent.putExtra("circular_transition", true);
            intent.putExtra("start_transition_alpha", 0.0f);
            intent.putExtra("start_transition_status_bar_color", statusBarColor);
            intent.putExtra("return_transition_status_bar_color", 0);
            intent.putExtra("start_transition_navigation_bar_color", i);
            intent.putExtra("return_transition_navigation_bar_color", 0);
            intent.putExtra("open_pic_selection_sheet", true);
            baseActivity.startActivityForResult(intent, 1053, AnonymousClass745.A05(baseActivity, C18070vi.A05(r11, 2131436426), r11.getTransitionNames().A02(2131899529)));
        }
    }

    public static final void setupShareNewsletterLinkButton$lambda$10(C78463sq r3, C46162Dk r4, View view) {
        C18070vi.A0h(r3, r4);
        r3.getWaIntents().get();
        r3.getBaseActivity().startActivity(AnonymousClass1LU.A16(r3.getBaseActivity(), r4.A0M(), 12), (Bundle) null);
    }

    public static final void setupShareToMyStatusButton$lambda$14$lambda$13(C46162Dk r9, C78463sq r10, Context context) {
        boolean A15 = C18070vi.A15(r9, r10);
        C29681ch A0M2 = r9.A0M();
        ArrayList A13 = AnonymousClass000.A13();
        AnonymousClass73D r92 = new AnonymousClass73D();
        AnonymousClass1E7 A012 = r10.A0w.A01(A0M2);
        String A0I2 = r10.A0l.A0I(A012);
        if (A0I2 == null) {
            A0I2 = "";
        }
        C20947Ac1 ac1 = new C20947Ac1(A0M2, AnonymousClass9Id.LINK_CARD, A0I2, A0I2, A15 ? 1 : 0);
        Context context2 = context;
        C18070vi.A0b(context);
        AnonymousClass72S A042 = ((AnonymousClass6GM) C18070vi.A0E(r10.getNewsletterStatusMediaGenerator())).A04(context, A012, ac1);
        if (!(A042 == null || A042.A0C() == null)) {
            A13.add(A042.A0X);
            r92.A06(A042);
        }
        r10.A0S.A0J(new C70833Cr((Object) context2, (Object) A13, (Object) r92, (Object) r10, 12));
    }

    public void A2V(AnonymousClass206 r3, boolean z) {
        super.A2V(getFMessage(), z);
        if (z || this.A09 == AnonymousClass00R.A00) {
            A01();
            this.A09 = AnonymousClass00R.A01;
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.A0D) {
            getContactObservers().unregisterObserver(this.A0O);
        }
    }

    private final int getLayoutRes() {
        return 2131624875;
    }

    public int getCenteredLayoutId() {
        return 2131624875;
    }

    public int getIncomingLayoutId() {
        return 2131624875;
    }

    public int getOutgoingLayoutId() {
        return 2131624875;
    }
}
