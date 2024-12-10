package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.3tt  reason: invalid class name and case insensitive filesystem */
public abstract class C78913tt extends C78553sz {
    public C26911Ty A00;
    public C24671Lf A01;
    public C27201Vd A02;
    public AnonymousClass1E7 A03;
    public AnonymousClass18K A04;
    public boolean A05 = true;
    public final ViewGroup A06;
    public final C42141xh A07;
    public final AnonymousClass1FY A08;
    public final WaTextView A09;
    public final C37451pZ A0A;
    public final AnonymousClass1BI A0B;
    public final WDSProfilePhoto A0C;
    public final C28931bI A0D;
    public final C18100vl A0E = AnonymousClass1DF.A01(new AnonymousClass5GV(this));

    public C78913tt(Context context, C108875cR r5, C436420i r6) {
        super(context, r5, r6);
        C28931bI r0;
        A1M();
        AnonymousClass1BI A002 = AnonymousClass205.A00(this.A0I);
        C18070vi.A0X(A002);
        this.A0B = A002;
        Activity A012 = AnonymousClass1L9.A01(context, AnonymousClass01E.class);
        C18070vi.A0z(A012, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
        this.A08 = (AnonymousClass1FY) A012;
        this.A03 = this.A0w.A01(A002);
        this.A07 = C42141xh.A01(this, this.A08, 2131429428);
        WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) AnonymousClass3MX.A0C(this, 2131429433);
        this.A0C = wDSProfilePhoto;
        wDSProfilePhoto.setContentDescription(getResources().getText(2131899332));
        this.A0A = getContactPhotos().A06(context, "conversation-row-contact-info");
        this.A09 = C72453Mb.A0g(this, 2131431625);
        this.A06 = (ViewGroup) AnonymousClass3MX.A0C(this, 2131429414);
        View findViewById = findViewById(2131432747);
        if (findViewById != null) {
            r0 = AnonymousClass3MW.A0p(findViewById);
        } else {
            r0 = null;
        }
        this.A0D = r0;
    }

    public abstract C23581Gv A2m();

    public abstract void A2o();

    public Drawable getBackgroundDrawable() {
        return null;
    }

    public abstract int getLayout();

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    public final void setBusinessProfileManager(C26911Ty r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setContact(AnonymousClass1E7 r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setContactObservers(C24671Lf r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setContactPhotos(C27201Vd r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setWamRuntime(AnonymousClass18K r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    private final C23581Gv getContactObserver() {
        return (C23581Gv) this.A0E.getValue();
    }

    public void A2V(AnonymousClass206 r3, boolean z) {
        if (z) {
            A2o();
        }
        if (this.A05) {
            getContactObservers().registerObserver(getContactObserver());
            this.A05 = false;
        }
    }

    public final void A2n() {
        C28931bI r3 = this.A0D;
        if (r3 != null) {
            if (!C18020vd.A05(C18040vf.A02, this.A0F, 8438) || !this.A03.A0O()) {
                this.A09.setVisibility(0);
                r3.A04(8);
                return;
            }
            this.A09.setVisibility(8);
            A2p(31);
            if (r3.A00 == null) {
                C89904dD.A00(r3.A02().findViewById(2131432747), this, 28);
            }
            r3.A04(0);
        }
    }

    public final void A2p(int i) {
        C171078r8 r1 = new C171078r8();
        r1.A01 = Integer.valueOf(i);
        r1.A04 = 21;
        r1.A03 = 10;
        r1.A02 = C17880vN.A0k();
        getWamRuntime().CC7(r1);
    }

    public final AnonymousClass1FY getActivity() {
        return this.A08;
    }

    public final C26911Ty getBusinessProfileManager() {
        C26911Ty r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("businessProfileManager");
        throw null;
    }

    public final AnonymousClass1BI getChatJid() {
        return this.A0B;
    }

    public final AnonymousClass1E7 getContact() {
        return this.A03;
    }

    public final C42141xh getContactNameViewController() {
        return this.A07;
    }

    public final C24671Lf getContactObservers() {
        C24671Lf r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactObservers");
        throw null;
    }

    public final WDSProfilePhoto getContactPhoto() {
        return this.A0C;
    }

    public final C37451pZ getContactPhotoLoader() {
        return this.A0A;
    }

    public final C27201Vd getContactPhotos() {
        C27201Vd r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactPhotos");
        throw null;
    }

    public final WaTextView getContactType() {
        return this.A09;
    }

    public final ViewGroup getHeader() {
        return this.A06;
    }

    public final C28931bI getMetaVerifiedLabelViewStub() {
        return this.A0D;
    }

    public final AnonymousClass18K getWamRuntime() {
        AnonymousClass18K r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1J();
        throw null;
    }

    public void onDetachedFromWindow() {
        this.A0A.A02();
        getContactObservers().unregisterObserver(getContactObserver());
        this.A05 = true;
        super.onDetachedFromWindow();
    }

    public int getCenteredLayoutId() {
        return getLayout();
    }

    public int getIncomingLayoutId() {
        return getLayout();
    }

    public int getOutgoingLayoutId() {
        return getLayout();
    }

    public void A1u() {
        A2o();
    }
}
