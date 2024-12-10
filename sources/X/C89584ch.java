package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.whatsapp.mentions.MentionableEntry;

/* renamed from: X.4ch  reason: invalid class name and case insensitive filesystem */
public class C89584ch implements TextWatcher {
    public boolean A00;
    public int A01;
    public C72783Nm[] A02;
    public final /* synthetic */ MentionableEntry A03;

    public C89584ch(MentionableEntry mentionableEntry) {
        this.A03 = mentionableEntry;
    }

    public void afterTextChanged(Editable editable) {
        if (this.A01 > 0) {
            MentionableEntry mentionableEntry = this.A03;
            C72783Nm[] r7 = this.A02;
            int i = 0;
            if (this.A00) {
                int length = r7.length;
                while (i < length) {
                    C72783Nm r3 = r7[i];
                    int spanStart = editable.getSpanStart(r3.A00);
                    int spanEnd = editable.getSpanEnd(r3);
                    if (!(spanStart == -1 || spanEnd == -1)) {
                        MentionableEntry.A0E(r3.A00, mentionableEntry);
                        MentionableEntry.A0E(r3, mentionableEntry);
                        editable.delete(spanStart, spanEnd);
                    }
                    i++;
                }
            } else {
                C72783Nm[] r32 = (C72783Nm[]) mentionableEntry.getEditableText().getSpans(mentionableEntry.getSelectionStart(), mentionableEntry.getSelectionEnd(), C72783Nm.class);
                MentionableEntry.A0E(mentionableEntry.A0E, mentionableEntry);
                mentionableEntry.A0E = null;
                int length2 = r32.length;
                while (i < length2) {
                    C72783Nm r1 = r32[i];
                    MentionableEntry.A0E(r1.A00, mentionableEntry);
                    MentionableEntry.A0E(r1, mentionableEntry);
                    i++;
                }
            }
        }
        MentionableEntry.A0C(editable, this.A03);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        MentionableEntry mentionableEntry = this.A03;
        int selectionEnd = mentionableEntry.getSelectionEnd();
        this.A02 = (C72783Nm[]) mentionableEntry.getEditableText().getSpans(selectionEnd, selectionEnd, C72783Nm.class);
        this.A00 = AnonymousClass000.A1T(mentionableEntry.getSelectionStart(), mentionableEntry.getSelectionEnd());
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A01 = i2;
    }
}
