package X;

import android.os.Bundle;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.util.Log;

/* renamed from: X.4fY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91354fY implements InputConnectionCompat.OnCommitContentListener {
    public final /* synthetic */ MentionableEntry A00;

    public final boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        AnonymousClass5a9 r0 = this.A00.A0F;
        if (r0 != null) {
            return r0.BpE(inputContentInfoCompat, i);
        }
        Log.e("mentionable/entry/no on commit content listener");
        return false;
    }

    public /* synthetic */ C91354fY(MentionableEntry mentionableEntry) {
        this.A00 = mentionableEntry;
    }
}
