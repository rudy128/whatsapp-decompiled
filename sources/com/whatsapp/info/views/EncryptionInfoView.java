package com.whatsapp.info.views;

import X.AnonymousClass00H;
import X.AnonymousClass1EC;
import X.AnonymousClass1FU;
import X.AnonymousClass1MZ;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass48j;
import X.C18070vi;
import X.C72473Md;
import X.C74793cj;
import X.C81723zh;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.ListItemWithLeftIcon;

public final class EncryptionInfoView extends ListItemWithLeftIcon {
    public AnonymousClass1MZ A00;
    public AnonymousClass00H A01;
    public boolean A02;
    public final AnonymousClass1FU A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EncryptionInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A04();
        this.A03 = AnonymousClass3MZ.A0P(context);
        setIcon(2131232065);
        C74793cj.A01(context, this, 2131888754);
        C72473Md.A0y(this);
    }

    public final void A0A(C81723zh r5, AnonymousClass1EC r6, boolean z) {
        C18070vi.A0d(r6, 2);
        int i = 2131888754;
        int i2 = 2131891005;
        int i3 = 25;
        if (z) {
            i = 2131896002;
            i2 = 2131895557;
            i3 = 26;
        }
        setOnClickListener(new AnonymousClass48j(r5, this, r6, i3));
        setTitle((CharSequence) AnonymousClass3Ma.A11(this, i));
        setDescription((CharSequence) AnonymousClass3Ma.A11(this, i2));
        setVisibility(0);
    }

    public final void setDependencyBridgeRegistryLazy$app_productinfra_chat_chat(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setGroupParticipantsManager$app_productinfra_chat_chat(AnonymousClass1MZ r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final AnonymousClass1FU getActivity() {
        return this.A03;
    }

    public final AnonymousClass00H getDependencyBridgeRegistryLazy$app_productinfra_chat_chat() {
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("dependencyBridgeRegistryLazy");
        throw null;
    }

    public final AnonymousClass1MZ getGroupParticipantsManager$app_productinfra_chat_chat() {
        AnonymousClass1MZ r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupParticipantsManager");
        throw null;
    }

    public EncryptionInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A04();
    }
}
