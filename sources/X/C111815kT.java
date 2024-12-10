package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.WaTextView;
import com.whatsapp.thunderstorm.ThunderstormContactListItemElements;
import java.util.List;

/* renamed from: X.5kT  reason: invalid class name and case insensitive filesystem */
public final class C111815kT extends C41251w3 {
    public final AnonymousClass1F9 A00;
    public final C131716lY A01;
    public final C36401np A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111815kT(AnonymousClass1F9 r2, C131716lY r3, C36401np r4) {
        super((C40411uf) C111615k0.A00);
        C18070vi.A0d(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == 0) {
            return new AnonymousClass6J0(AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131627197), this.A00, this.A01, this.A02);
        } else if (i == 1) {
            View inflate = AnonymousClass3MZ.A0D(viewGroup).inflate(2131627199, viewGroup, false);
            List list = C42011xT.A0I;
            C72453Mb.A1S(inflate);
            return new C42011xT(inflate);
        } else {
            C17900vP.A0i("ThunderstormContactListAdapter/onCreateViewHolder type not handled - ", AnonymousClass000.A10(), i);
            throw AnonymousClass001.A13("Unexpected view type: ", AnonymousClass000.A10(), i);
        }
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r8, int i) {
        C112925mG r82 = (C112925mG) r8;
        C140096zw r4 = (C140096zw) C72463Mc.A0l(this, r82, i);
        if (r82 instanceof AnonymousClass6J0) {
            AnonymousClass6J0 r83 = (AnonymousClass6J0) r82;
            C18070vi.A0d(r4, 0);
            r83.A00 = r4;
            ThunderstormContactListItemElements thunderstormContactListItemElements = (ThunderstormContactListItemElements) AnonymousClass3MX.A0C(r83.A0H, 2131436146);
            r83.A01 = thunderstormContactListItemElements;
            if (thunderstormContactListItemElements != null) {
                WaTextView waTextView = thunderstormContactListItemElements.A02;
                AnonymousClass1DT r6 = r4.A04;
                waTextView.setText((CharSequence) r6.A06());
                thunderstormContactListItemElements.setIcon(r4.A07);
                AnonymousClass1DT r5 = r4.A03;
                String A1F = C108945cZ.A1F(r5);
                if (A1F == null) {
                    A1F = "";
                }
                thunderstormContactListItemElements.setSubtitle(A1F);
                ThunderstormContactListItemElements thunderstormContactListItemElements2 = r83.A01;
                if (thunderstormContactListItemElements2 != null) {
                    AnonymousClass78M.A00(thunderstormContactListItemElements2, r4, r83, 4);
                    ViewStub A0F = AnonymousClass3MW.A0F(thunderstormContactListItemElements, 2131436182);
                    if (A0F != null && thunderstormContactListItemElements.A00 == null) {
                        View inflate = A0F.inflate();
                        C18070vi.A0z(inflate, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
                        thunderstormContactListItemElements.setTransferStatusAnimation((LottieAnimationView) inflate);
                    }
                    AnonymousClass1F9 r3 = r83.A02;
                    AnonymousClass7AS.A00(r3, r6, new AnonymousClass81W(r83), 26);
                    AnonymousClass7AS.A00(r3, r5, new AnonymousClass81X(r83), 26);
                    AnonymousClass7AS.A00(r3, r4.A02, C108945cZ.A1K(r83, 33), 26);
                    AnonymousClass7AS.A00(r3, r4.A05, C108945cZ.A1K(r83, 34), 26);
                    AnonymousClass7AS.A00(r3, r4.A06, C108945cZ.A1K(r83, 35), 26);
                    return;
                }
            }
            C18070vi.A11("item");
            throw null;
        }
        C72453Mb.A0W(C108965cb.A09(r82, r4), 2131436154).setText((CharSequence) r4.A04.A06());
    }

    public int getItemViewType(int i) {
        return ((C140096zw) A0U(i)).A01;
    }
}
