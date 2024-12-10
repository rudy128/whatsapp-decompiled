package X;

import android.text.TextUtils;
import android.view.View;
import com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel;
import com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsFragment;
import com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel;
import com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel$onSkinToneSelected$1;
import com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.78D  reason: invalid class name */
public class AnonymousClass78D implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public AnonymousClass78D(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A03 = obj2;
        this.A04 = obj3;
    }

    public final void onClick(View view) {
        AnonymousClass8pG r0;
        C20274AEh A0C;
        switch (this.A00) {
            case 0:
                int i = this.A01;
                AnonymousClass4FM r02 = (AnonymousClass4FM) this.A03;
                View view2 = (View) this.A04;
                ConversationsSuggestedContactsViewModel conversationsSuggestedContactsViewModel = ((C110495fx) this.A02).A04;
                if (conversationsSuggestedContactsViewModel != null) {
                    conversationsSuggestedContactsViewModel.A0U(view, view2, C82934Cs.PROFILE_PIC, r02.A00, r02.A01, i);
                    return;
                }
                return;
            case 1:
                int i2 = this.A01;
                int[] iArr = (int[]) this.A03;
                EmojiExpressionsViewModel emojiExpressionsViewModel = (EmojiExpressionsViewModel) ((EmojiExpressionsFragment) this.A02).A0Q.getValue();
                C18070vi.A0b(iArr);
                C18070vi.A0d(iArr, 1);
                C1409873v.A04(emojiExpressionsViewModel.A07, iArr);
                emojiExpressionsViewModel.A0T(iArr, i2);
                AnonymousClass3MX.A1Q(new EmojiExpressionsViewModel$onSkinToneSelected$1(emojiExpressionsViewModel, (C30391dr) null, iArr, i2), C41561wd.A00(emojiExpressionsViewModel));
                ((View) this.A04).setVisibility(8);
                return;
            case 2:
                int i3 = this.A01;
                Object obj = this.A04;
                List list = C42011xT.A0I;
                ((C111825kU) this.A02).A0C.invoke(((AnonymousClass60H) this.A03).A01, Integer.valueOf(i3), obj);
                return;
            case 3:
                C161748Hp r5 = (C161748Hp) this.A02;
                int i4 = this.A01;
                AnonymousClass8pS r3 = (AnonymousClass8pS) this.A04;
                r5.A02.A01(((C42011xT) this.A03).A0H);
                int i5 = 0;
                for (int i6 = 0; i6 < i4; i6++) {
                    if (r5.getItemViewType(i6) == 0) {
                        i5++;
                    }
                }
                int i7 = i4 - i5;
                IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = (IndiaUpiBankPickerActivity) r5.A01;
                indiaUpiBankPickerActivity.A0L = r3;
                indiaUpiBankPickerActivity.A00 = i7;
                if (!indiaUpiBankPickerActivity.A0M.A0B() || !C137476vW.A00(r3.A0F)) {
                    IndiaUpiBankPickerActivity.A03(r3, indiaUpiBankPickerActivity, i7);
                    return;
                } else {
                    indiaUpiBankPickerActivity.A0R.set(true);
                    return;
                }
            case 4:
                C112125ky r4 = (C112125ky) this.A02;
                int i8 = this.A01;
                C113545nG r7 = (C113545nG) this.A03;
                AnonymousClass6nH r6 = (AnonymousClass6nH) this.A04;
                List list2 = r4.A05;
                if (((AnonymousClass6nH) list2.get(i8)).A01) {
                    AnonymousClass6nH r2 = (AnonymousClass6nH) list2.get(i8);
                    AEX aex = r2.A03;
                    if (aex != null) {
                        r7.A02.setVisibility(8);
                        r7.A03.setVisibility(0);
                        AnonymousClass72F r42 = r7.A05;
                        C145197Ki r32 = new C145197Ki(r2, r7);
                        boolean isEmpty = TextUtils.isEmpty(aex.A05);
                        AnonymousClass10I r22 = r42.A0C;
                        if (isEmpty) {
                            C17890vO.A0u(new AnonymousClass6MP(aex, r42, r32, 1), r22);
                            return;
                        } else {
                            r22.CGF(new C21435Ak2(r42, aex, r32, 29));
                            return;
                        }
                    } else {
                        throw AnonymousClass000.A0n("Default theme should not have download failed state");
                    }
                } else if (r4.A00 != i8) {
                    ArrayList A10 = C17880vN.A10(list2);
                    AnonymousClass6nH r1 = new AnonymousClass6nH(((AnonymousClass6nH) list2.get(r4.A00)).A03);
                    r1.A02 = false;
                    r1.A00 = ((AnonymousClass6nH) list2.get(r4.A00)).A00;
                    r1.A01 = ((AnonymousClass6nH) list2.get(r4.A00)).A01;
                    A10.set(r4.A00, r1);
                    AEX aex2 = r6.A03;
                    AnonymousClass6nH r12 = new AnonymousClass6nH(aex2);
                    r12.A02 = true;
                    r12.A00 = r6.A00;
                    r12.A01 = r6.A01;
                    A10.set(i8, r12);
                    r4.A01 = aex2;
                    r4.A00 = i8;
                    r4.A04.C8Z(aex2);
                    r4.A0U(A10);
                    return;
                } else {
                    return;
                }
            default:
                C161588Gc r62 = (C161588Gc) this.A02;
                int i9 = this.A01;
                C20284AEs aEs = (C20284AEs) this.A03;
                AW0 aw0 = (AW0) this.A04;
                AnonymousClass9NU r03 = r62.A06;
                if (!(r03 == null || (r0 = r03.A01.A0A) == null || (A0C = r0.A0C()) == null)) {
                    C161588Gc.A03(A0C, r62, C17880vN.A0h(), 39);
                }
                C198789yu r13 = new C198789yu(i9);
                r13.A04 = aEs;
                r13.A05 = aw0;
                r62.A08.A0F(r13);
                return;
        }
    }
}
