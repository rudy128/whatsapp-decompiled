package X;

import android.text.Editable;
import android.text.style.ForegroundColorSpan;
import android.util.Range;
import com.whatsapp.mentions.MentionableEntry;

/* renamed from: X.5Qi  reason: invalid class name and case insensitive filesystem */
public final class C105005Qi extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ MentionableEntry $mentionableEntry;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105005Qi(MentionableEntry mentionableEntry) {
        super(1);
        this.$mentionableEntry = mentionableEntry;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Range range = (Range) obj;
        Editable text = this.$mentionableEntry.getText();
        if (text != null) {
            C83704Gi.A00(text, AnonymousClass3MW.A15(C72753Nj.class));
            if (range != null) {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(AnonymousClass3Ma.A00(AnonymousClass3MY.A04(this.$mentionableEntry), 2130971981, 2131101293));
                Comparable lower = range.getLower();
                C18070vi.A0X(lower);
                int A0M = AnonymousClass000.A0M(lower);
                Comparable upper = range.getUpper();
                C18070vi.A0X(upper);
                text.setSpan(foregroundColorSpan, A0M, AnonymousClass000.A0M(upper), 33);
            }
        }
        return C27621Wu.A00;
    }
}
