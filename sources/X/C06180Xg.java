package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Xg  reason: invalid class name and case insensitive filesystem */
public final class C06180Xg implements C16740sw {
    public final ClipboardManager A00;

    public C06180Xg(Context context) {
        Object systemService = context.getSystemService("clipboard");
        C18070vi.A0z(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.A00 = (ClipboardManager) systemService;
    }

    public static final C27069DRu A00(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new C27069DRu((List) null, 6, charSequence.toString());
        }
        Spanned spanned = (Spanned) charSequence;
        int i = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList A13 = AnonymousClass000.A13();
        int A0G = C200410p.A0G(annotationArr);
        if (A0G >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i];
                if (C18070vi.A18(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    A13.add(new C26047CrE(new AnonymousClass0Q1(annotation.getValue()).A06(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i == A0G) {
                    break;
                }
                i++;
            }
        }
        return new C27069DRu(A13, 4, charSequence.toString());
    }

    public C27069DRu BaF() {
        ClipData primaryClip = this.A00.getPrimaryClip();
        CharSequence charSequence = null;
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        if (itemAt != null) {
            charSequence = itemAt.getText();
        }
        return A00(charSequence);
    }

    public void CL4(C27069DRu dRu) {
        this.A00.setPrimaryClip(ClipData.newPlainText("plain text", A01(dRu)));
    }

    public static final CharSequence A01(C27069DRu dRu) {
        List A03 = dRu.A03();
        boolean isEmpty = A03.isEmpty();
        String A02 = dRu.A02();
        if (isEmpty) {
            return A02;
        }
        SpannableString spannableString = new SpannableString(A02);
        AnonymousClass0KY r7 = new AnonymousClass0KY();
        int size = A03.size();
        for (int i = 0; i < size; i++) {
            C26047CrE crE = (C26047CrE) A03.get(i);
            int A01 = crE.A01();
            int A022 = crE.A02();
            r7.A00.recycle();
            r7.A00 = Parcel.obtain();
            r7.A01((C26053CrN) crE.A03());
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(r7.A00.marshall(), 0)), A01, A022, 33);
        }
        return spannableString;
    }
}
