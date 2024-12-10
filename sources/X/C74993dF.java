package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.ListItemWithLeftIcon;

/* renamed from: X.3dF  reason: invalid class name and case insensitive filesystem */
public final class C74993dF extends ListItemWithLeftIcon {
    public C107255Yz A00;
    public AnonymousClass4SE A01;
    public AnonymousClass1Nb A02;
    public boolean A03;
    public final AnonymousClass1FY A04;

    public C74993dF(Context context) {
        super(context, (AttributeSet) null);
        A04();
        this.A04 = (AnonymousClass1FY) AnonymousClass1L9.A01(context, AnonymousClass1FY.class);
        C72473Md.A0y(this);
        setIcon(2131233334);
        C74793cj.A01(context, this, 2131895933);
    }

    public final void setChatSettingsStore$app_product_community_community(AnonymousClass1Nb r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setMediaVisibilityInfoUpdateHelperFactory$app_product_community_community(C107255Yz r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final AnonymousClass1FY getActivity() {
        return this.A04;
    }

    public final AnonymousClass1Nb getChatSettingsStore$app_product_community_community() {
        AnonymousClass1Nb r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("chatSettingsStore");
        throw null;
    }

    public final C107255Yz getMediaVisibilityInfoUpdateHelperFactory$app_product_community_community() {
        C107255Yz r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("mediaVisibilityInfoUpdateHelperFactory");
        throw null;
    }
}
