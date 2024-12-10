package X;

import android.content.DialogInterface;
import com.whatsapp.bot.botmemory.MemoryActivity;
import com.whatsapp.bot.botmemory.MemoryViewModel;
import com.whatsapp.bot.botmemory.MemoryViewModel$deleteAllMemories$2;
import com.whatsapp.conversation.ChangeNumberNotificationDialogFragment;

/* renamed from: X.74y  reason: invalid class name and case insensitive filesystem */
public class C1412674y implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public C1412674y(Object obj, Object obj2, int i, boolean z) {
        this.A00 = i;
        this.A03 = z;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A00 != 0) {
            ChangeNumberNotificationDialogFragment changeNumberNotificationDialogFragment = (ChangeNumberNotificationDialogFragment) this.A01;
            boolean z = this.A03;
            AnonymousClass1E7 r2 = (AnonymousClass1E7) this.A02;
            if (z) {
                dialogInterface.dismiss();
                return;
            }
            C23231Ff r1 = changeNumberNotificationDialogFragment.A01;
            if (r1 != null) {
                r1.BBm(r2, (AnonymousClass1BI) C72453Mb.A0m(r2));
                return;
            }
            return;
        }
        boolean z2 = this.A03;
        MemoryActivity memoryActivity = (MemoryActivity) this.A01;
        C18090vk r5 = (C18090vk) this.A02;
        if (z2) {
            MemoryViewModel A0J = C108965cb.A0J(memoryActivity);
            AnonymousClass1G4 r3 = A0J.A03;
            do {
            } while (!r3.BFK(r3.getValue(), new C115745vg(2131892187)));
            AnonymousClass3MX.A1Q(new MemoryViewModel$deleteAllMemories$2(A0J, (C30391dr) null), C41561wd.A00(A0J));
        }
        if (r5 != null) {
            r5.invoke();
        }
    }
}
