package X;

import android.app.Activity;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.mentions.MentionableEntry;

/* renamed from: X.6jr  reason: invalid class name and case insensitive filesystem */
public class C130696jr {
    public final View A00;
    public final View A01;
    public final ViewTreeObserver.OnGlobalLayoutListener A02;
    public final ImageButton A03;
    public final C107845ai A04;
    public final C74873d3 A05;
    public final AnonymousClass4UI A06;
    public final MentionableEntry A07;
    public final AnonymousClass1L4 A08;

    public C130696jr(Activity activity, View view, AnonymousClass190 r39, AnonymousClass11C r40, C19830z4 r41, C18000vb r42, AnonymousClass1L2 r43, A59 a59, C1193267r r45, AnonymousClass1KW r46, EmojiSearchProvider emojiSearchProvider, C18030ve r48, AnonymousClass1BI r49, C18010vc r50, AnonymousClass1L4 r51) {
        C142987Bo r4 = new C142987Bo(this, 1);
        this.A04 = r4;
        AnonymousClass793 r0 = new AnonymousClass793(this, 9);
        this.A02 = r0;
        View view2 = view;
        this.A01 = view2;
        AnonymousClass1L4 r5 = r51;
        this.A08 = r5;
        this.A00 = view2.findViewById(2131430311);
        MentionableEntry mentionableEntry = (MentionableEntry) AnonymousClass1HF.A06(view2, 2131429201);
        this.A07 = mentionableEntry;
        mentionableEntry.setInputEnterDone(true);
        mentionableEntry.setFilters(new InputFilter[]{new C1418577f(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)});
        mentionableEntry.setOnEditorActionListener(new AnonymousClass79Y(this, 2));
        C18030ve r20 = r48;
        C18010vc r21 = r50;
        AnonymousClass11C r13 = r40;
        C18000vb r15 = r42;
        AnonymousClass1KW r18 = r46;
        mentionableEntry.addTextChangedListener(new AnonymousClass48A(mentionableEntry, AnonymousClass3MW.A0J(view2, 2131429680), r13, r15, r43, r18, r20, r21, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 30, true, false, false));
        AnonymousClass1BI r7 = r49;
        if (mentionableEntry.A0O(r7)) {
            mentionableEntry.A0M(AnonymousClass3MW.A0C(view2, 2131432483), r7, false, true, true, false);
        }
        ImageButton imageButton = (ImageButton) view2.findViewById(2131430328);
        this.A03 = imageButton;
        Activity activity2 = activity;
        C74873d3 r72 = new C74873d3(activity2, imageButton, r39, (AnonymousClass5YX) activity2.findViewById(2131432239), mentionableEntry, r13, r41, r15, a59, r45, r18, emojiSearchProvider, r20, r21, r5, 19, A3P.A00(r7));
        this.A05 = r72;
        AnonymousClass4UI r6 = new AnonymousClass4UI(activity2, r72, (EmojiSearchContainer) view2.findViewById(2131430335));
        this.A06 = r6;
        r6.A00 = new AnonymousClass7GD(this, 1);
        r72.A0J(r4);
        r72.A0E = new AnonymousClass7RA((Object) this, 6);
        view2.getViewTreeObserver().addOnGlobalLayoutListener(r0);
    }
}
