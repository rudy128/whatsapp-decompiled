package com.whatsapp.bot.commands;

import X.AnonymousClass00R;
import X.AnonymousClass28K;
import X.AnonymousClass3MX;
import X.AnonymousClass3UN;
import X.AnonymousClass4DV;
import X.AnonymousClass4YU;
import X.C106615Wn;
import X.C18070vi;
import X.C32951i1;
import X.C41111vp;
import X.C73463Wa;
import X.C77863rc;
import X.C90204dh;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.jid.UserJid;
import java.util.List;

public final class BotCommandsPickerView extends C77863rc {
    public C73463Wa A00;
    public C32951i1 A01;
    public UserJid A02;
    public AnonymousClass3UN A03;
    public boolean A04 = true;
    public LinearLayoutManager A05;
    public RecyclerView A06;
    public C106615Wn A07;
    public List A08;
    public final AnonymousClass4DV A09 = AnonymousClass4DV.BOT_COMMANDS;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BotCommandsPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0e(context, 1, attributeSet);
    }

    public final void setChatMessageCounts(C32951i1 r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setCommandList(List list, Bitmap bitmap) {
        C18070vi.A0d(list, 0);
        C73463Wa r0 = this.A00;
        if (r0 != null) {
            r0.A01 = list;
            r0.A00 = bitmap;
            r0.notifyDataSetChanged();
        }
    }

    public final void setupView(List list, Bitmap bitmap, View view, C106615Wn r8, UserJid userJid, AnonymousClass3UN r10) {
        C18070vi.A0d(list, 0);
        C18070vi.A0g(r8, 3, r10);
        this.A08 = list;
        this.A02 = userJid;
        this.A07 = r8;
        this.A03 = r10;
        this.A06 = AnonymousClass3MX.A0Q(this, 2131428297);
        C73463Wa r1 = new C73463Wa(bitmap, r8, list);
        this.A00 = r1;
        r1.CDq(new AnonymousClass28K(this, 0));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        this.A05 = linearLayoutManager;
        RecyclerView recyclerView = this.A06;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.A06;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.A00);
        }
        setVisibility(8);
        if (view != null) {
            setAnchorWidthView(view);
            view.addOnLayoutChangeListener(new C90204dh(view, this, 0));
        }
    }

    public boolean BEB() {
        AnonymousClass4YU r0;
        List list;
        AnonymousClass3UN r02 = this.A03;
        if (r02 == null || (r0 = (AnonymousClass4YU) r02.A05.A06()) == null || (list = r0.A02) == null || !(!list.isEmpty())) {
            return false;
        }
        return true;
    }

    public void Bcx(boolean z) {
        AnonymousClass3UN r0 = this.A03;
        if (r0 != null) {
            C41111vp r4 = r0.A05;
            AnonymousClass4YU r02 = (AnonymousClass4YU) r4.A06();
            r4.A0F(new AnonymousClass4YU(r02.A00, r02.A01, r02.A02, false));
        }
        A07(0, getResources().getDimensionPixelSize(2131165482));
        this.A04 = true;
    }

    public void CMX() {
        UserJid userJid;
        C73463Wa r0 = this.A00;
        if (r0 != null) {
            int size = r0.A01.size();
            A07(size, getResources().getDimensionPixelSize(2131165482));
            if (size == 0) {
                this.A04 = true;
            } else if (this.A04 && (userJid = this.A02) != null) {
                this.A04 = false;
                getChatMessageCounts().A0D(userJid, AnonymousClass00R.A0Y);
            }
        }
    }

    public final C32951i1 getChatMessageCounts() {
        C32951i1 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("chatMessageCounts");
        throw null;
    }

    public View getContentView() {
        RecyclerView recyclerView = this.A06;
        C18070vi.A0z(recyclerView, "null cannot be cast to non-null type android.view.View");
        return recyclerView;
    }

    public AnonymousClass4DV getType() {
        return this.A09;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BotCommandsPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0e(context, 1, attributeSet);
        A04();
        A04();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BotCommandsPickerView(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A04();
        A04();
    }
}
