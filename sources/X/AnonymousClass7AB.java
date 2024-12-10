package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.whatsapp.avatar.editor.AvatarEditorLauncherActivity;

/* renamed from: X.7AB  reason: invalid class name */
public class AnonymousClass7AB implements AnonymousClass1GE, C218317o {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass7AB(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void BrH(AnonymousClass1F9 r3) {
        int i = this.A00;
        ((Fragment) this.A01).A0L.A06(this);
        Object obj = this.A02;
        if (i != 0) {
            ((Activity) obj).finish();
        } else {
            AvatarEditorLauncherActivity.A03((AvatarEditorLauncherActivity) obj);
        }
    }

    public /* synthetic */ void C6E() {
    }

    public /* synthetic */ void BqQ(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void C0B(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void C3z(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void C71(AnonymousClass1F9 r1) {
    }
}
