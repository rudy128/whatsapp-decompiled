package X;

import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout;
import com.whatsapp.conversation.conversationrow.NativeFlowMessageButtonBottomSheet;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.9mM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C191299mM {
    public final /* synthetic */ AnonymousClass3uP A00;
    public final /* synthetic */ InteractiveButtonsRowContentLayout A01;
    public final /* synthetic */ NativeFlowMessageButtonBottomSheet A02;
    public final /* synthetic */ AnonymousClass9NP A03;
    public final /* synthetic */ List A04;

    public final void A00(LinearLayout linearLayout, TextEmojiLabel textEmojiLabel) {
        InteractiveButtonsRowContentLayout interactiveButtonsRowContentLayout = this.A01;
        NativeFlowMessageButtonBottomSheet nativeFlowMessageButtonBottomSheet = this.A02;
        List list = this.A04;
        AnonymousClass3uP r10 = this.A00;
        AnonymousClass9NP r1 = this.A03;
        String str = r1.A02;
        TextEmojiLabel textEmojiLabel2 = textEmojiLabel;
        if (!(textEmojiLabel == null || str == null)) {
            textEmojiLabel2.setText(str);
        }
        LinkedHashSet A14 = C17880vN.A14();
        JSONArray jSONArray = r1.A03;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof Integer) {
                    A14.add(obj);
                }
            }
        }
        LinearLayout linearLayout2 = linearLayout;
        if (linearLayout != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean contains = A14.contains(Integer.valueOf(i2));
                C85524Ns r9 = (C85524Ns) list.get(i2);
                linearLayout2.addView(InteractiveButtonsRowContentLayout.A00(C19740yt.A03(interactiveButtonsRowContentLayout.getContext(), 2131102459), C19740yt.A03(interactiveButtonsRowContentLayout.getContext(), 2131102460), r10, new C85524Ns(new C94624kv(r9, nativeFlowMessageButtonBottomSheet, 0), r9.A02, r9.A00, r9.A03), interactiveButtonsRowContentLayout, i2, true, contains, true));
            }
        }
    }

    public /* synthetic */ C191299mM(AnonymousClass3uP r1, InteractiveButtonsRowContentLayout interactiveButtonsRowContentLayout, NativeFlowMessageButtonBottomSheet nativeFlowMessageButtonBottomSheet, AnonymousClass9NP r4, List list) {
        this.A01 = interactiveButtonsRowContentLayout;
        this.A02 = nativeFlowMessageButtonBottomSheet;
        this.A04 = list;
        this.A00 = r1;
        this.A03 = r4;
    }
}
