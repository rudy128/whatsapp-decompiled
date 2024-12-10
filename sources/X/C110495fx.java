package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.util.List;

/* renamed from: X.5fx  reason: invalid class name and case insensitive filesystem */
public final class C110495fx extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass1KB A00;
    public C72043Kk A01;
    public C24921Me A02;
    public C27201Vd A03;
    public ConversationsSuggestedContactsViewModel A04;
    public AnonymousClass11C A05;
    public AnonymousClass11P A06;
    public C19830z4 A07;
    public C18030ve A08;
    public C34771l3 A09;
    public C111255jJ A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass031 A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final Context A0G;
    public final C18100vl A0H;
    public final C18100vl A0I;
    public final C18100vl A0J;
    public final C18100vl A0K;
    public final C18100vl A0L;
    public final C18100vl A0M;
    public final C18100vl A0N;

    public static final void A00(C110495fx r13, List list) {
        View childAt;
        String A022;
        C139106yE r0;
        int i = 0;
        do {
            C110495fx r8 = r13;
            if (i < list.size()) {
                AnonymousClass4FM r9 = (AnonymousClass4FM) list.get(i);
                if (i >= r13.getSuggestedContactsListView().getChildCount()) {
                    childAt = LayoutInflater.from(r13.A0G).inflate(2131624997, r13.getSuggestedContactsListView(), false);
                    r13.getSuggestedContactsListView().addView(childAt);
                } else {
                    childAt = r13.getSuggestedContactsListView().getChildAt(i);
                }
                C18030ve abProps = r13.getAbProps();
                C18040vf r2 = C18040vf.A02;
                if (C18020vd.A05(r2, abProps, 9240)) {
                    childAt.getLayoutParams().height = AnonymousClass3MW.A01(r13.getResources(), 2131165851);
                }
                WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) childAt.findViewById(2131435912);
                if (C18020vd.A05(r2, r13.getAbProps(), 9240)) {
                    wDSProfilePhoto.setProfilePhotoSize(C39191sf.SMALL);
                }
                C22941Dw r02 = UserJid.Companion;
                UserJid A0w = AnonymousClass3MZ.A0w(r9.A00);
                String str = null;
                if (A0w != null) {
                    C111255jJ r03 = r13.A0A;
                    if (r03 != null) {
                        r0 = r03.A0T(A0w);
                    } else {
                        r0 = null;
                    }
                    r9.A01 = r0;
                }
                if (C72453Mb.A1a(r13.A0H)) {
                    wDSProfilePhoto.setProfileBadge((C39241sk) null);
                }
                r13.getPhotoLoader().A07(wDSProfilePhoto, r9.A00);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(C110495fx.class.getName());
                AnonymousClass1BI r04 = r9.A00.A0J;
                if (r04 != null) {
                    str = r04.getRawString();
                }
                AnonymousClass1Xr.A04(wDSProfilePhoto, AnonymousClass000.A0y(str, A10));
                C42141xh A012 = C42141xh.A01(childAt, r13.getTextEmojiLabelViewControllerFactory(), 2131435911);
                if (C18020vd.A05(r2, r13.getAbProps(), 9240)) {
                    A012.A01.setTextSize(0, r13.A0G.getResources().getDimension(2131169432));
                }
                if (!AnonymousClass1J8.A09(r13.getAbProps())) {
                    C43421zm.A04(A012.A01);
                }
                r13.setContactName(A012, r9.A00);
                TextEmojiLabel A0W = AnonymousClass3MX.A0W(childAt, 2131435910);
                if (C18020vd.A05(r2, r13.getAbProps(), 9240) || (A022 = AnonymousClass72Y.A02(A0W.getContext(), r13.getTime(), r9.A00, r13.getAbProps())) == null) {
                    A0W.setVisibility(8);
                } else {
                    A0W.A0S(A022, (List) null, 0, false);
                    A0W.setVisibility(0);
                }
                C139106yE r05 = r9.A01;
                C18070vi.A0b(wDSProfilePhoto);
                r13.setStatus(r05, wDSProfilePhoto);
                View findViewById = childAt.findViewById(2131435909);
                wDSProfilePhoto.setOnClickListener(new AnonymousClass78D(r8, r9, findViewById, i, 0));
                AnonymousClass78T.A00(findViewById, r13, r9, i, 13);
            } else if (i < r13.getSuggestedContactsListView().getChildCount()) {
                r13.getSuggestedContactsListView().removeViewAt(i);
            }
            i++;
        } while (i < 5);
        r13.getSuggestedContactDismissButton().setOnClickListener(new C89924dF(r13, 20));
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setContactPhotos(C27201Vd r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setGlobalUI(AnonymousClass1KB r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setPresenceManager(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0B = r2;
    }

    public final void setStatusesViewModelFactory(C34771l3 r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setTextEmojiLabelViewControllerFactory(C72043Kk r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setTime(AnonymousClass11P r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setWaContactNames(C24921Me r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setWaSharedPreferences(C19830z4 r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    private final C28931bI getLoadingSpinnerViewStub() {
        return AnonymousClass3MX.A0v(this.A0I);
    }

    private final C37451pZ getPhotoLoader() {
        return (C37451pZ) this.A0K.getValue();
    }

    private final ImageView getSuggestedContactDismissButton() {
        return (ImageView) AnonymousClass3MX.A14(this.A0L);
    }

    private final FrameLayout getSuggestedContactsContainer() {
        return (FrameLayout) AnonymousClass3MX.A14(this.A0M);
    }

    private final LinearLayout getSuggestedContactsListView() {
        return (LinearLayout) AnonymousClass3MX.A14(this.A0N);
    }

    private final C28931bI getSuggestedContactsViewStub() {
        return AnonymousClass3MX.A0v(this.A0J);
    }

    /* access modifiers changed from: private */
    public final void setLoadingVisibility(boolean z) {
        AnonymousClass3MX.A0v(this.A0I).A04(C72453Mb.A07(z ? 1 : 0));
    }

    private final void setStatus(C139106yE r3, WDSProfilePhoto wDSProfilePhoto) {
        boolean z;
        if (r3 == null || r3.A01 <= 0 || !r3.A01()) {
            z = false;
        } else {
            wDSProfilePhoto.setProfileStatus(new C39231sj(C39211sh.UNSEEN));
            z = true;
        }
        wDSProfilePhoto.setStatusIndicatorEnabled(z);
    }

    private final void setupObservers(ConversationsSuggestedContactsViewModel conversationsSuggestedContactsViewModel, AnonymousClass1F9 r5) {
        C41731wy r1 = conversationsSuggestedContactsViewModel.A0C;
        r1.A09(r5);
        AnonymousClass7AT.A01(r5, r1, C108945cZ.A1K(this, 8), 23);
        C41731wy r12 = conversationsSuggestedContactsViewModel.A0E;
        r12.A09(r5);
        AnonymousClass7AT.A01(r5, r12, C108945cZ.A1K(this, 9), 23);
        C41731wy r13 = conversationsSuggestedContactsViewModel.A0G;
        r13.A09(r5);
        AnonymousClass7AT.A01(r5, r13, C108945cZ.A1K(this, 10), 23);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0C;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final C27201Vd getContactPhotos() {
        C27201Vd r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactPhotos");
        throw null;
    }

    public final AnonymousClass1KB getGlobalUI() {
        AnonymousClass1KB r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1C();
        throw null;
    }

    public final AnonymousClass00H getPresenceManager() {
        AnonymousClass00H r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("presenceManager");
        throw null;
    }

    public final C34771l3 getStatusesViewModelFactory() {
        C34771l3 r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("statusesViewModelFactory");
        throw null;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public final C72043Kk getTextEmojiLabelViewControllerFactory() {
        C72043Kk r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("textEmojiLabelViewControllerFactory");
        throw null;
    }

    public final AnonymousClass11P getTime() {
        AnonymousClass11P r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("time");
        throw null;
    }

    public final C24921Me getWaContactNames() {
        C24921Me r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waContactNames");
        throw null;
    }

    public final C19830z4 getWaSharedPreferences() {
        C19830z4 r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waSharedPreferences");
        throw null;
    }

    public void onAttachedToWindow() {
        ConversationsSuggestedContactsViewModel conversationsSuggestedContactsViewModel;
        C111255jJ r0;
        AnonymousClass1DT r2;
        if (!this.A0E) {
            View.inflate(this.A0G, 2131624996, this);
            this.A0E = true;
        }
        super.onAttachedToWindow();
        if (C18020vd.A05(C18040vf.A02, getAbProps(), 7223)) {
            AnonymousClass1FD A002 = ViewTreeViewModelStoreOwner.A00(this);
            if (A002 != null) {
                this.A04 = (ConversationsSuggestedContactsViewModel) AnonymousClass3MW.A0N(A002).A00(ConversationsSuggestedContactsViewModel.class);
                AnonymousClass1F9 A003 = AnonymousClass1ZG.A00(this);
                if (A003 != null) {
                    ConversationsSuggestedContactsViewModel conversationsSuggestedContactsViewModel2 = this.A04;
                    if (conversationsSuggestedContactsViewModel2 != null) {
                        setupObservers(conversationsSuggestedContactsViewModel2, A003);
                    } else {
                        return;
                    }
                }
                if (this.A0A == null) {
                    AnonymousClass1FD A004 = ViewTreeViewModelStoreOwner.A00(this);
                    if (A004 != null) {
                        this.A0A = C108995ce.A0S(A004, getStatusesViewModelFactory());
                        AnonymousClass1F9 A005 = AnonymousClass1ZG.A00(this);
                        if (!(A005 == null || (r0 = this.A0A) == null || (r2 = r0.A04) == null)) {
                            AnonymousClass7AT.A01(A005, r2, new C100985Am(this, 45), 23);
                        }
                    } else {
                        throw C17880vN.A0g();
                    }
                }
                if (this.A0F && (conversationsSuggestedContactsViewModel = this.A04) != null) {
                    conversationsSuggestedContactsViewModel.A0T();
                    return;
                }
                return;
            }
            throw C17880vN.A0g();
        }
    }

    public C110495fx(Context context) {
        super(context);
        if (!this.A0D) {
            this.A0D = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A08 = AnonymousClass10E.A8r(A0O);
            this.A03 = AnonymousClass3MZ.A0i(A0O);
            this.A00 = AnonymousClass10E.A12(A0O);
            this.A0B = C000200d.A00(A0O.A8b);
            AnonymousClass10G r1 = A0O.A00;
            this.A09 = (C34771l3) r1.A0E.get();
            this.A05 = AnonymousClass3Ma.A0a(A0O);
            this.A01 = AnonymousClass3MZ.A0T(r1);
            this.A06 = AnonymousClass10E.A6O(A0O);
            this.A02 = AnonymousClass3MZ.A0g(A0O);
            this.A07 = AnonymousClass3Ma.A0c(A0O);
        }
        this.A0G = context;
        this.A0H = AnonymousClass1DF.A01(new C149637jN(this));
        this.A0J = AnonymousClass1DF.A01(new C149697jT(this));
        this.A0I = AnonymousClass1DF.A01(new C149647jO(this));
        this.A0N = AnonymousClass1DF.A01(new C149687jS(this));
        this.A0L = AnonymousClass1DF.A01(new C149667jQ(this));
        this.A0M = AnonymousClass1DF.A01(new C149677jR(this));
        this.A0K = AnonymousClass1DF.A01(new C149657jP(this));
    }

    private final void setContactName(C42141xh r3, AnonymousClass1E7 r4) {
        String A0N2 = getWaContactNames().A0N(r4);
        if (A0N2 != null) {
            r3.A0B((List) null, A0N2);
        }
    }

    public final ConversationsSuggestedContactsViewModel getViewModel() {
        return this.A04;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getPhotoLoader().A02();
    }

    public final void setSuggestionsVisibility(boolean z) {
        getSuggestedContactsContainer().setVisibility(C72453Mb.A07(z ? 1 : 0));
    }
}
