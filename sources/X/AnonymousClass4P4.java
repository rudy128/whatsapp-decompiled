package X;

import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.mediacomposer.ui.caption.CaptionFragment;
import com.whatsapp.mentions.MentionableEntry;
import java.util.List;

/* renamed from: X.4P4  reason: invalid class name */
public class AnonymousClass4P4 {
    public final View A00;
    public final ViewTreeObserver.OnGlobalLayoutListener A01;
    public final C107845ai A02;
    public final C74873d3 A03;
    public final AnonymousClass4UI A04;
    public final MentionableEntry A05;
    public final C108515bp A06;
    public final AnonymousClass1L4 A07;

    public AnonymousClass4P4(View view, AnonymousClass1FL r41, AnonymousClass190 r42, AnonymousClass11C r43, C19830z4 r44, C18000vb r45, AnonymousClass1E7 r46, AnonymousClass1L2 r47, A59 a59, C1193267r r49, AnonymousClass1KW r50, EmojiSearchProvider emojiSearchProvider, C18030ve r52, C108515bp r53, C18010vc r54, AnonymousClass1L4 r55, String str, List list, List list2, boolean z) {
        int i;
        C92094gk r2 = new C92094gk(this, 11);
        this.A02 = r2;
        C90584eJ r0 = new C90584eJ((Object) this, 30);
        this.A01 = r0;
        View view2 = view;
        this.A00 = view2;
        AnonymousClass1L4 r4 = r55;
        this.A07 = r4;
        C108515bp r10 = r53;
        this.A06 = r10;
        AnonymousClass1FL r11 = r41;
        CaptionFragment captionFragment = (CaptionFragment) r11.getSupportFragmentManager().A0O(2131431650);
        MentionableEntry mentionableEntry = captionFragment.A26().A0B;
        this.A05 = mentionableEntry;
        mentionableEntry.setInputEnterAction(6);
        mentionableEntry.setFilters(new InputFilter[]{new C1418577f(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)});
        boolean z2 = z;
        mentionableEntry.setOnKeyListener(new C90174de(this, z2));
        mentionableEntry.setOnEditorActionListener(new C90974ew(r10, this, z2));
        C18030ve r23 = r52;
        AnonymousClass1KW r21 = r50;
        C18000vb r18 = r45;
        AnonymousClass11C r16 = r43;
        C18010vc r24 = r54;
        mentionableEntry.addTextChangedListener(new AnonymousClass48A(mentionableEntry, AnonymousClass3MX.A0M(C28931bI.A00(view2, 2131429680)), r16, r18, r47, r21, r23, r24, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 30, true, false, false));
        AnonymousClass1E7 r102 = r46;
        if (r46 != null && mentionableEntry.A0O(r102.A0J)) {
            ViewGroup A0C = AnonymousClass3MW.A0C(view2, 2131432483);
            mentionableEntry.A04 = view2;
            mentionableEntry.A0M(A0C, r102.A0J, true, false, false, false);
        }
        String str2 = str;
        if (!TextUtils.isEmpty(str2)) {
            mentionableEntry.setMentionableText(str2, list);
        }
        ImageView imageView = (ImageView) captionFragment.A26().A0D.A02();
        AnonymousClass5YX r14 = (AnonymousClass5YX) r11.findViewById(2131432239);
        List list3 = list2;
        if (list2 == null || list3.isEmpty()) {
            i = null;
        } else {
            i = list3.size() == 1 ? A3P.A00((AnonymousClass1BI) list3.get(0)) : 7;
        }
        C19830z4 r17 = r44;
        AnonymousClass190 r13 = r42;
        C74873d3 r103 = new C74873d3(r11, imageView, r13, r14, mentionableEntry, r16, r17, r18, a59, r49, r21, emojiSearchProvider, r23, r24, r4, 9, i);
        this.A03 = r103;
        r103.A00 = 2131232116;
        r103.A02 = 2131232028;
        AnonymousClass4aX.A0B(imageView.getContext(), imageView, 2131232116, 2131101210);
        AnonymousClass4UI r7 = new AnonymousClass4UI(r11, r103, (EmojiSearchContainer) view2.findViewById(2131430335));
        this.A04 = r7;
        r7.A00 = new C95914n0(this, 10);
        r103.A0J(r2);
        r103.A0E = new AnonymousClass7RC(this, 30);
        view2.getViewTreeObserver().addOnGlobalLayoutListener(r0);
    }
}
