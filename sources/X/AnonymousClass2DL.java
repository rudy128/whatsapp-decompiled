package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2DL  reason: invalid class name */
public final class AnonymousClass2DL extends C42071xZ {
    public void A0H(Context context, View view, C19880zA r12, C42081xa r13, C42091xb r14, C42101xc r15, C24921Me r16, AnonymousClass118 r17, C18000vb r18, C18030ve r19) {
        View A05;
        C18070vi.A0d(context, 0);
        C24921Me r5 = r16;
        AnonymousClass118 r3 = r17;
        C18000vb r6 = r18;
        C18030ve r7 = r19;
        C18070vi.A0w(view, r3, r7, r5, r6);
        C19880zA r4 = r12;
        C18070vi.A0q(r12, r13, r14);
        C18070vi.A0d(r15, 9);
        this.A0V = r15;
        ViewStub viewStub = (ViewStub) view.findViewById(2131429650);
        if (viewStub != null) {
            viewStub.setLayoutResource(2131627413);
            A05 = viewStub.inflate();
            C18070vi.A0z(A05, "null cannot be cast to non-null type com.whatsapp.wds.components.list.listitem.migration.WDSListItemConversationHeader");
        } else {
            A05 = C18070vi.A05(view, 2131429649);
        }
        this.A09 = new C42131xg(r3.A00, r4, r5, r6, r7, (C42121xe) A05);
        this.A02 = AnonymousClass1HF.A06(view, 2131434753).getRootView();
        if (!AnonymousClass1J8.A09(r7)) {
            C43421zm.A04(this.A09.A03.A01);
        }
        this.A0P = C28931bI.A00(view, 2131434205);
        this.A04 = (ImageView) AnonymousClass1HF.A06(view, 2131429433);
        this.A0I = C28931bI.A00(view, 2131431258);
        this.A03 = AnonymousClass1HF.A06(view, 2131431481);
        this.A0U = C28931bI.A00(view, 2131435863);
        C42071xZ.A01(context, view);
        this.A0F = C28931bI.A00(view, 2131433424);
        this.A01 = AnonymousClass1HF.A06(view, 2131429455);
        this.A07 = (TextEmojiLabel) AnonymousClass1HF.A06(view, 2131435461);
        this.A00 = AnonymousClass1HF.A06(view, 2131428342);
        this.A08 = (TextEmojiLabel) AnonymousClass1HF.A06(view, 2131432810);
        this.A0R = C28931bI.A00(view, 2131429615);
        this.A0J = C28931bI.A00(view, 2131429658);
        this.A0L = C28931bI.A00(view, 2131429655);
        C18030ve r2 = this.A09.A05;
        C18040vf r42 = C18040vf.A01;
        if (!C18020vd.A05(r42, r2, 11407)) {
            this.A0L.A02();
        }
        this.A0G = C28931bI.A00(view, 2131429296);
        this.A06 = (ImageView) AnonymousClass1HF.A06(view, 2131435648);
        this.A0S = C28931bI.A00(view, 2131435694);
        this.A05 = (ImageView) AnonymousClass1HF.A06(view, 2131432690);
        this.A0N = C28931bI.A00(view, 2131433695);
        this.A0M = C28931bI.A00(view, 2131432882);
        this.A0O = C28931bI.A00(view, 2131433847);
        this.A0H = C28931bI.A00(view, 2131430161);
        this.A0T = C28931bI.A00(view, 2131430164);
        this.A0C = C28931bI.A00(view, 2131427708);
        this.A0K = C28931bI.A00(view, 2131429600);
        this.A0E = C28931bI.A00(view, 2131433425);
        this.A0M.A07(new AnonymousClass3AS(context, this, 0));
        this.A0O.A07(new AnonymousClass3AS(context, this, 1));
        if (!C18020vd.A05(r42, this.A09.A05, 11407)) {
            C27641Ww.A03(this.A0L.A02(), context.getResources().getDimensionPixelSize(2131166255), 0);
        }
        this.A0D = C28931bI.A00(view, 2131427852);
        this.A0Q = C28931bI.A00(view, 2131435130);
        this.A0X = C28931bI.A00(view, 2131429646);
        this.A0W = C28931bI.A00(view, 2131429642);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2DL(Context context, View view, C19880zA r4, C42081xa r5, C42091xb r6, C42101xc r7, C24921Me r8, C37451pZ r9, C37471pb r10, C34021jm r11, AnonymousClass118 r12, C18000vb r13, C18030ve r14, C43351zf r15, boolean z) {
        super(context, view, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, z);
        C18070vi.A0j(context, view);
        C18070vi.A0d(r10, 5);
        C18070vi.A0d(r9, 6);
        C18070vi.A0d(r12, 10);
        C18070vi.A0y(r14, r8, r13, r4, r5);
        C18070vi.A0m(r6, r7);
    }
}
