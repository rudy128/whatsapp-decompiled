package X;

import android.text.TextUtils;
import com.whatsapp.status.widget.StatusEditText;
import com.whatsapp.statuscomposer.composer.TextStatusComposerFragment;

/* renamed from: X.81K  reason: invalid class name */
public final class AnonymousClass81K extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ TextStatusComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass81K(TextStatusComposerFragment textStatusComposerFragment) {
        super(1);
        this.this$0 = textStatusComposerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int A0M = AnonymousClass000.A0M(obj);
        StatusEditText statusEditText = this.this$0.A0l;
        String str = "entry";
        if (statusEditText != null) {
            if (statusEditText.getText() != null) {
                TextStatusComposerFragment textStatusComposerFragment = this.this$0;
                C32011gU r1 = textStatusComposerFragment.A0f;
                if (r1 != null) {
                    StatusEditText statusEditText2 = textStatusComposerFragment.A0l;
                    if (statusEditText2 != null) {
                        String A02 = r1.A02(AnonymousClass3MZ.A17(statusEditText2));
                        AnonymousClass3TA r0 = this.this$0.A0O;
                        if (r0 == null) {
                            str = "webPagePreviewViewModel";
                        } else if (!TextUtils.equals(r0.A0A, A02)) {
                            this.this$0.A28((C143887Fe) null, A0M);
                        }
                    }
                } else {
                    C18070vi.A11("linkifyWeb");
                    throw null;
                }
            }
            return C27621Wu.A00;
        }
        C18070vi.A11(str);
        throw null;
    }
}
