package X;

import android.content.res.Resources;
import com.whatsapp.group.KeyboardControllerViewModel;
import com.whatsapp.group.KeyboardControllerViewModel$setSelectedEmoji$1;

/* renamed from: X.4gl  reason: invalid class name and case insensitive filesystem */
public class C92104gl implements C107845ai {
    public final /* synthetic */ Resources A00;
    public final /* synthetic */ C95924n1 A01;

    public void BmC() {
    }

    public C92104gl(Resources resources, C95924n1 r2) {
        this.A01 = r2;
        this.A00 = resources;
    }

    public void BsW(int[] iArr) {
        C95924n1 r0 = this.A01;
        KeyboardControllerViewModel keyboardControllerViewModel = r0.A08;
        C17960vV.A07(keyboardControllerViewModel);
        Resources resources = this.A00;
        C95764ml r5 = new C95764ml(resources, r0, iArr);
        C18070vi.A0h(iArr, resources);
        AnonymousClass3Ma.A1R(keyboardControllerViewModel.A00);
        AnonymousClass1OX A002 = C41561wd.A00(keyboardControllerViewModel);
        keyboardControllerViewModel.A00 = C30451dy.A02(AnonymousClass00R.A00, keyboardControllerViewModel.A03, new KeyboardControllerViewModel$setSelectedEmoji$1(resources, r5, keyboardControllerViewModel, (C30391dr) null, iArr), A002);
    }
}
