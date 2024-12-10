package com.whatsapp.conversation.selection.ui;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass1KW;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass5HC;
import X.AnonymousClass5SE;
import X.AnonymousClass5ZZ;
import X.C107265Za;
import X.C108025b0;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18460wS;
import X.C29431cG;
import X.C72463Mc;
import X.C73523Wh;
import X.C87044Ub;
import X.C87564Wb;
import X.C88094Yh;
import X.C94384kX;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public final class MessageSelectionBottomMenu extends MaterialCardView implements AnonymousClass009 {
    public C88094Yh A00;
    public C18000vb A01;
    public AnonymousClass1KW A02;
    public C18030ve A03;
    public AnonymousClass031 A04;
    public boolean A05;
    public int A06;
    public C73523Wh A07;
    public final RecyclerView A08;
    public final C94384kX A09;
    public final List A0A;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MessageSelectionBottomMenu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setEmojiLoader(AnonymousClass1KW r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setUp(C108025b0 r12, AnonymousClass5ZZ r13, C107265Za r14, C87564Wb r15) {
        C18070vi.A0d(r12, 0);
        C18070vi.A0o(r13, r14, r15);
        Context A042 = AnonymousClass3MY.A04(this);
        AnonymousClass1KW emojiLoader = getEmojiLoader();
        C18000vb whatsAppLocale = getWhatsAppLocale();
        C94384kX r2 = this.A09;
        this.A00 = new C88094Yh(A042, r2, r13, r14, r15, r12, whatsAppLocale, emojiLoader, getAbProps(), (Integer) null);
        C73523Wh r1 = new C73523Wh(new AnonymousClass5HC(this), new AnonymousClass5SE(this));
        this.A07 = r1;
        this.A08.setAdapter(r1);
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public static final void A01(MessageSelectionBottomMenu messageSelectionBottomMenu) {
        List list = messageSelectionBottomMenu.A0A;
        if (!list.isEmpty()) {
            boolean z = true;
            int size = (messageSelectionBottomMenu.A06 + 1) % list.size();
            messageSelectionBottomMenu.A06 = size;
            C73523Wh r5 = messageSelectionBottomMenu.A07;
            if (r5 != null) {
                List list2 = (List) list.get(size);
                if (list.size() <= 1) {
                    z = false;
                }
                C18070vi.A0d(list2, 0);
                r5.A00 = z;
                List list3 = r5.A01;
                list3.clear();
                ArrayList A13 = AnonymousClass000.A13();
                for (Object next : list2) {
                    if (((C87044Ub) next).A02) {
                        A13.add(next);
                    }
                }
                list3.addAll(A13);
                r5.notifyDataSetChanged();
            }
        }
    }

    public final void A02() {
        Collection collection;
        int i;
        C88094Yh r0 = this.A00;
        if (r0 != null) {
            List<C87044Ub> A022 = r0.A02();
            C94384kX r9 = this.A09;
            ArrayList A0s = C72463Mc.A0s(A022);
            ArrayList A13 = AnonymousClass000.A13();
            ArrayList A132 = AnonymousClass000.A13();
            for (C87044Ub r3 : A022) {
                if (r3.A02 && (i = r3.A03) != 39) {
                    Set set = r9.A01;
                    Integer valueOf = Integer.valueOf(i);
                    if (set.contains(valueOf)) {
                        A0s.add(r3);
                    } else {
                        set = r9.A00;
                        if (set.contains(valueOf)) {
                            A132.add(r3);
                        } else {
                            A13.add(r3);
                        }
                    }
                    set.remove(valueOf);
                }
            }
            ArrayList A133 = AnonymousClass000.A13();
            A133.addAll(A0s);
            A133.addAll(A13);
            A133.addAll(A132);
            if (A133.size() <= 4) {
                collection = C18070vi.A0M(A133);
            } else {
                collection = C29431cG.A0i(A133, 3, 3);
            }
        } else {
            collection = C18460wS.A00;
        }
        this.A06 = -1;
        List list = this.A0A;
        list.clear();
        list.addAll(collection);
        A01(this);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A04;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass1KW getEmojiLoader() {
        AnonymousClass1KW r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emojiLoader");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageSelectionBottomMenu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            setAbProps(AnonymousClass10E.A8r(A0O));
            setEmojiLoader(AnonymousClass3Ma.A0f(A0O));
            setWhatsAppLocale(AnonymousClass10E.A6Q(A0O));
        }
        this.A09 = new C94384kX();
        this.A0A = AnonymousClass000.A13();
        setRadius(AnonymousClass3MW.A00(context.getResources(), 2131169405));
        setCardBackgroundColor(AnonymousClass3Ma.A00(context, 2130970508, 2131101878));
        setElevation(AnonymousClass3MW.A00(context.getResources(), 2131167719));
        View.inflate(context, 2131626043, this);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass3MX.A0C(this, 2131428333);
        this.A08 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
    }

    public /* synthetic */ MessageSelectionBottomMenu(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MessageSelectionBottomMenu(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
