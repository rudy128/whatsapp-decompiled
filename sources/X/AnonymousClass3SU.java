package X;

import android.view.View;
import com.whatsapp.KeyboardPopupLayout;

/* renamed from: X.3SU  reason: invalid class name */
public final class AnonymousClass3SU extends C25247Cbm {
    public C18090vk A00;
    public C18090vk A01;
    public C18090vk A02;
    public final View A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3SU(View view, int i, boolean z) {
        super(i);
        C18070vi.A0d(view, 1);
        this.A03 = view;
        this.A04 = z;
    }

    public AnonymousClass1HO A00(AnonymousClass1HO r8) {
        C18070vi.A0d(r8, 0);
        View view = this.A03;
        if (((view instanceof KeyboardPopupLayout) && ((KeyboardPopupLayout) view).A09) || !this.A04) {
            return r8;
        }
        C33321id A07 = r8.A07(8);
        C18070vi.A0X(A07);
        C33321id A072 = r8.A07(7);
        C18070vi.A0X(A072);
        C33321id A022 = C33321id.A02(C33321id.A00(A07.A01 - A072.A01, A07.A03 - A072.A03, A07.A02 - A072.A02, A07.A00 - A072.A00), C33321id.A04);
        view.setTranslationY((float) (A022.A03 - A022.A00));
        return r8;
    }

    public void A01(C26000CqH cqH) {
        C18070vi.A0d(cqH, 1);
        C18090vk r0 = this.A02;
        if (r0 != null) {
            r0.invoke();
            this.A02 = null;
        }
    }

    public void A02(C25972Cpf cpf) {
        View view = this.A03;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C18090vk r0 = this.A01;
        if (r0 != null) {
            r0.invoke();
            this.A01 = null;
        }
        C18090vk r02 = this.A00;
        if (r02 != null) {
            r02.invoke();
        }
    }
}
