package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText;
import com.whatsapp.mediacomposer.doodle.textentry.TextEntryView;

/* renamed from: X.6Ii  reason: invalid class name */
public class AnonymousClass6Ii extends C89564cf {
    public Object A00;
    public Object A01;
    public final int A02;
    public final Object A03;

    public AnonymousClass6Ii(DoodleEditText doodleEditText, AnonymousClass8BD r3, TextEntryView textEntryView) {
        this.A02 = 2;
        this.A01 = doodleEditText;
        this.A03 = textEntryView;
        this.A00 = r3;
    }

    public void afterTextChanged(Editable editable) {
        if (2 - this.A02 != 0) {
            super.afterTextChanged(editable);
            return;
        }
        C18070vi.A0d(editable, 0);
        TextView textView = (TextView) this.A01;
        Context context = textView.getContext();
        TextPaint paint = textView.getPaint();
        TextEntryView textEntryView = (TextEntryView) this.A03;
        C43251zV.A07(context, paint, editable, textEntryView.getEmojiLoader(), textEntryView.getAbProps());
        AnonymousClass8BD r2 = (AnonymousClass8BD) this.A00;
        DoodleEditText doodleEditText = textEntryView.A05;
        if (doodleEditText == null) {
            C18070vi.A11("doodleEditText");
            throw null;
        }
        int A032 = C108995ce.A03(doodleEditText);
        C18070vi.A0X(textView.getPaint());
        r2.BLM(editable, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r5.length() == 0) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        r1.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0071, code lost:
        r0 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            int r0 = r4.A02
            switch(r0) {
                case 0: goto L_0x003f;
                case 1: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onTextChanged(r5, r6, r7, r8)
            return
        L_0x0009:
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            java.lang.Object r1 = r4.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L_0x001e
            java.lang.Object r0 = r4.A03
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = (com.whatsapp.emoji.search.EmojiSearchKeyboardContainer) r0
            com.whatsapp.InterceptingEditText r0 = r0.A04
            if (r0 == 0) goto L_0x001e
            r0.removeCallbacks(r1)
        L_0x001e:
            java.lang.Object r1 = r4.A03
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r1 = (com.whatsapp.emoji.search.EmojiSearchKeyboardContainer) r1
            r0 = 32
            X.3C4 r3 = new X.3C4
            r3.<init>(r4, r5, r1, r0)
            r4.A01 = r3
            com.whatsapp.InterceptingEditText r2 = r1.A04
            if (r2 == 0) goto L_0x0034
            long r0 = r1.A00
            r2.postDelayed(r3, r0)
        L_0x0034:
            java.lang.Object r1 = r4.A00
            android.view.View r1 = (android.view.View) r1
            int r0 = r5.length()
            if (r0 != 0) goto L_0x0071
            goto L_0x006c
        L_0x003f:
            java.lang.Object r1 = r4.A00
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L_0x004e
            java.lang.Object r0 = r4.A01
            com.whatsapp.emoji.search.EmojiSearchContainer r0 = (com.whatsapp.emoji.search.EmojiSearchContainer) r0
            com.whatsapp.InterceptingEditText r0 = r0.A04
            r0.removeCallbacks(r1)
        L_0x004e:
            r0 = 39
            X.3Ch r3 = new X.3Ch
            r3.<init>(r4, r5, r0)
            r4.A00 = r3
            java.lang.Object r0 = r4.A01
            com.whatsapp.emoji.search.EmojiSearchContainer r0 = (com.whatsapp.emoji.search.EmojiSearchContainer) r0
            com.whatsapp.InterceptingEditText r2 = r0.A04
            r0 = 500(0x1f4, double:2.47E-321)
            r2.postDelayed(r3, r0)
            java.lang.Object r1 = r4.A03
            android.view.View r1 = (android.view.View) r1
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x0071
        L_0x006c:
            r0 = 4
        L_0x006d:
            r1.setVisibility(r0)
            return
        L_0x0071:
            r0 = 0
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Ii.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public AnonymousClass6Ii(View view, EmojiSearchContainer emojiSearchContainer) {
        this.A02 = 0;
        this.A01 = emojiSearchContainer;
        this.A03 = view;
    }

    public AnonymousClass6Ii(View view, EmojiSearchKeyboardContainer emojiSearchKeyboardContainer, int i) {
        this.A02 = i;
        this.A03 = emojiSearchKeyboardContainer;
        this.A00 = view;
    }
}
