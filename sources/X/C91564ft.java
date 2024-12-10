package X;

import android.view.View;
import android.widget.Button;
import com.whatsapp.messagetranslation.onboarding.langselector.TranslationLanguageSelectorFragment;
import java.util.ArrayList;

/* renamed from: X.4ft  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91564ft implements C22851Dl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C83294Eo A03;
    public final /* synthetic */ C73053Ou A04;
    public final /* synthetic */ TranslationLanguageSelectorFragment A05;
    public final /* synthetic */ C122716Rq A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ C98474rD A09;

    public final void Bo9(Object obj) {
        String obj2;
        String A0q;
        C18090vk r7;
        int i;
        int i2;
        Button button;
        long j;
        C122716Rq r72 = this.A06;
        C83294Eo r4 = this.A03;
        C98474rD r5 = this.A09;
        C73053Ou r9 = this.A04;
        TranslationLanguageSelectorFragment translationLanguageSelectorFragment = this.A05;
        long j2 = this.A01;
        View view = this.A02;
        String str = this.A07;
        String str2 = this.A08;
        int i3 = this.A00;
        AnonymousClass6TT r2 = (AnonymousClass6TT) obj;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageTranslationLanguageSelectorFragment/downloading/");
        A10.append(r72.name());
        C17900vP.A0Y(r2, "/nextModelDownloadStatus: ", A10);
        if (C18070vi.A18(r2, C119926Al.A00) || C18070vi.A18(r2, C119896Ai.A00) || C18070vi.A18(r2, C119916Ak.A00)) {
            ((AnonymousClass436) r4).A00 = r5.element;
        } else if (r2 instanceof C119886Ah) {
            AnonymousClass436 r42 = (AnonymousClass436) r4;
            int i4 = ((C119886Ah) r2).A00;
            if (i4 <= 0) {
                j = 0;
            } else {
                j = j2 - ((long) i4);
            }
            int i5 = (int) j;
            r42.A00 = i5;
            r9.notifyDataSetChanged();
            r5.element = i5;
            return;
        } else if (r2 instanceof C119956Ao) {
            ArrayList A002 = TranslationLanguageSelectorFragment.A00(AnonymousClass3MY.A04(view), translationLanguageSelectorFragment);
            TranslationLanguageSelectorFragment.A02(r9, translationLanguageSelectorFragment, str, str2, A002);
            Button button2 = translationLanguageSelectorFragment.A00;
            if (button2 != null) {
                button2.setEnabled(true);
            }
            C18070vi.A0d(A002, 0);
            r9.A01 = A002;
        } else {
            C119946An r1 = C119946An.A00;
            if (C18070vi.A18(r2, r1) || (r2 instanceof C119876Ag)) {
                C83294Eo A003 = r9.getItem(i3);
                C18070vi.A0z(A003, "null cannot be cast to non-null type com.whatsapp.messagetranslation.onboarding.langselector.AvailableLanguageItem");
                AnonymousClass436 r43 = (AnonymousClass436) A003;
                boolean z = r2 instanceof C119876Ag;
                if (z) {
                    obj2 = ((C119876Ag) r2).A00.getMessage();
                } else {
                    obj2 = r1.toString();
                }
                C17900vP.A0e("MessageTranslationLanguageSelectorFragment/mlModelDownload/failed to download/", obj2, AnonymousClass000.A10());
                if (!z || !(((C119876Ag) r2).A00 instanceof AnonymousClass6SF)) {
                    A0q = C17880vN.A0q(view.getContext(), r43.A04, new Object[1], 0, 2131899539);
                    r7 = new C99124sJ(view, r9, translationLanguageSelectorFragment, str, str2, i3, 0);
                    i = 2131899540;
                    i2 = 2131897145;
                } else {
                    A0q = C17880vN.A0q(view.getContext(), r43.A04, new Object[1], 0, 2131899541);
                    i = 2131899542;
                    r7 = new C99164sN(translationLanguageSelectorFragment, 3);
                    i2 = 2131898677;
                }
                TranslationLanguageSelectorFragment.A03(translationLanguageSelectorFragment, A0q, r7, new C99094sG(translationLanguageSelectorFragment, r43, r9, 2), i, i2);
                r43.A01 = false;
                if (!(r9.A00 == -1 || (button = translationLanguageSelectorFragment.A00) == null)) {
                    button.setEnabled(true);
                }
            } else if (!C18070vi.A18(r2, C119906Aj.A00) && !C18070vi.A18(r2, C119936Am.A00)) {
                throw AnonymousClass3MW.A14();
            } else {
                return;
            }
        }
        r9.notifyDataSetChanged();
    }

    public /* synthetic */ C91564ft(View view, C83294Eo r2, C73053Ou r3, TranslationLanguageSelectorFragment translationLanguageSelectorFragment, C122716Rq r5, String str, String str2, C98474rD r8, int i, long j) {
        this.A06 = r5;
        this.A03 = r2;
        this.A09 = r8;
        this.A04 = r3;
        this.A05 = translationLanguageSelectorFragment;
        this.A01 = j;
        this.A02 = view;
        this.A07 = str;
        this.A08 = str2;
        this.A00 = i;
    }
}
