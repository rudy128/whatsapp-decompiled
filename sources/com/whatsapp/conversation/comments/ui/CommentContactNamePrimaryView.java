package com.whatsapp.conversation.comments.ui;

import X.AnonymousClass10E;
import X.AnonymousClass1CJ;
import X.AnonymousClass1MZ;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4VN;
import X.C18070vi;
import X.C24921Me;
import X.C72453Mb;
import X.C72463Mc;
import X.C72483Me;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.TextEmojiLabel;

public final class CommentContactNamePrimaryView extends TextEmojiLabel {
    public C24921Me A00;
    public AnonymousClass4VN A01;
    public AnonymousClass1CJ A02;
    public AnonymousClass1MZ A03;
    public boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentContactNamePrimaryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A0I();
    }

    public final void setChatsCache(AnonymousClass1CJ r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setConversationFont(AnonymousClass4VN r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setGroupParticipantsManager(AnonymousClass1MZ r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setWaContactNames(C24921Me r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public void A0I() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E A0X = C72463Mc.A0X(this);
            C72483Me.A0s(A0X, this);
            C72483Me.A0r(A0X, this);
            this.A02 = AnonymousClass3Ma.A0d(A0X);
            this.A01 = C72453Mb.A0i(A0X);
            this.A03 = AnonymousClass3MY.A0V(A0X);
            this.A00 = AnonymousClass3MZ.A0g(A0X);
        }
    }

    public final AnonymousClass1CJ getChatsCache() {
        AnonymousClass1CJ r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1I();
        throw null;
    }

    public final AnonymousClass4VN getConversationFont() {
        AnonymousClass4VN r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("conversationFont");
        throw null;
    }

    public final AnonymousClass1MZ getGroupParticipantsManager() {
        AnonymousClass1MZ r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupParticipantsManager");
        throw null;
    }

    public final C24921Me getWaContactNames() {
        C24921Me r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waContactNames");
        throw null;
    }

    public CommentContactNamePrimaryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A0I();
    }

    public /* synthetic */ CommentContactNamePrimaryView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }
}
