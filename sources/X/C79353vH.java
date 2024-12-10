package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

/* renamed from: X.3vH  reason: invalid class name and case insensitive filesystem */
public final class C79353vH extends AnonymousClass3SW {
    public Map A00 = AnonymousClass1D7.A0I();
    public final C29681ch A01;
    public final AnonymousClass1OS A02;
    public final LayoutInflater A03;
    public final AnonymousClass1LU A04;

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        C18070vi.A0d(viewGroup, 2);
        if (view == null) {
            view2 = this.A03.inflate(2131626181, viewGroup, false);
        } else {
            view2 = view;
        }
        ViewGroup A0D = AnonymousClass3MW.A0D(view2, 2131429027);
        View view3 = super.getView(i, A0D.getChildAt(0), viewGroup);
        C18070vi.A0z(view3, "null cannot be cast to non-null type com.whatsapp.conversation.conversationrow.ConversationRow");
        AnonymousClass3uP r1 = (AnonymousClass3uP) view3;
        AnonymousClass4HL.A00(AnonymousClass3MY.A04(view2), r1);
        if (view == null) {
            A0D.addView(r1);
        }
        long j = r1.getFMessage().A0y;
        view2.findViewById(2131432996).setOnClickListener(new C89714cu(this, j, 1));
        View findViewById = view2.findViewById(2131433083);
        TextView A0E = C17880vN.A0E(view2, 2131433114);
        Context context = view2.getContext();
        AnonymousClass446 r3 = (AnonymousClass446) this.A00.get(String.valueOf(j));
        if (r3 != null) {
            C18070vi.A0b(context);
            C18070vi.A0b(findViewById);
            findViewById.setVisibility(0);
            AnonymousClass3Ma.A1F(findViewById, this, context, r3, 35);
            A0E.setVisibility(0);
            AnonymousClass3MY.A0y(context, A0E, new Object[]{context.getString(AnonymousClass4HN.A00(r3.A03))}, 2131892864);
            return view2;
        }
        findViewById.setVisibility(8);
        A0E.setVisibility(8);
        return view2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79353vH(Context context, AnonymousClass11S r13, AnonymousClass1M9 r14, C37451pZ r15, C88524a2 r16, C108875cR r17, AnonymousClass1LU r18, C29681ch r19, AnonymousClass1W6 r20, AnonymousClass48j r21, AnonymousClass1OS r22) {
        super(context, r13, r14, r15, r16, r17, r20, r21);
        AnonymousClass1LU r1 = r18;
        C29681ch r0 = r19;
        C72473Md.A1K(r1, r0);
        this.A04 = r1;
        this.A01 = r0;
        this.A02 = r22;
        LayoutInflater from = LayoutInflater.from(context);
        C18070vi.A0X(from);
        this.A03 = from;
    }
}
