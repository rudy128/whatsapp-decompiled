package X;

import com.whatsapp.conversation.selection.SingleSelectedMessageActivity;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.textstatus.AddTextStatusActivity;

/* renamed from: X.7GE  reason: invalid class name */
public class AnonymousClass7GE implements C107395Zn {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass7GE(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void BsX(AnonymousClass737 r5) {
        switch (this.A00) {
            case 0:
                AnonymousClass4UI r3 = (AnonymousClass4UI) this.A02;
                C18070vi.A0j(r3, r5);
                ReactionsTrayViewModel reactionsTrayViewModel = ((SingleSelectedMessageActivity) this.A01).A07;
                if (reactionsTrayViewModel == null) {
                    C18070vi.A11("reactionsTrayViewModel");
                    throw null;
                }
                String A06 = C43251zV.A06(r5.A00);
                C18070vi.A0X(A06);
                reactionsTrayViewModel.A0W(A06);
                r3.A00(false);
                return;
            case 1:
                RegisterName registerName = (RegisterName) this.A01;
                C74873d3 r2 = (C74873d3) this.A02;
                C18070vi.A0j(r2, r5);
                registerName.A1g.BsW(r5.A00);
                r2.A0E = new C21449AkG((Object) registerName, 14);
                return;
            default:
                AnonymousClass4UI r22 = (AnonymousClass4UI) this.A01;
                C18070vi.A0e(r22, 0, r5);
                r22.A00(false);
                ((AddTextStatusActivity) this.A02).A0I.BsW(r5.A00);
                return;
        }
    }
}
