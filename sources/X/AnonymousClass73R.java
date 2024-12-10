package X;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.audiopicker.AudioPickerActivity;
import com.whatsapp.components.SelectionCheckView;
import java.io.File;
import java.util.LinkedHashMap;

/* renamed from: X.73R  reason: invalid class name */
public class AnonymousClass73R {
    public final int A00;
    public final View A01;
    public final View A02;
    public final FrameLayout A03;
    public final ImageButton A04;
    public final ImageView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final CircularProgressBar A0A;
    public final SelectionCheckView A0B;
    public final /* synthetic */ AudioPickerActivity A0C;

    public AnonymousClass73R(View view, AudioPickerActivity audioPickerActivity, int i) {
        this.A0C = audioPickerActivity;
        this.A00 = i;
        this.A02 = view;
        this.A03 = (FrameLayout) view.findViewById(2131427898);
        this.A05 = AnonymousClass3MW.A0H(view, 2131427897);
        this.A0B = (SelectionCheckView) view.findViewById(2131435130);
        this.A09 = C17880vN.A0E(view, 2131427899);
        this.A06 = C17880vN.A0E(view, 2131427892);
        this.A07 = C17880vN.A0E(view, 2131427894);
        this.A08 = C17880vN.A0E(view, 2131427896);
        this.A01 = view.findViewById(2131428479);
        this.A04 = (ImageButton) view.findViewById(2131427895);
        this.A0A = (CircularProgressBar) view.findViewById(2131434181);
    }

    public static void A00(Context context, AnonymousClass73R r5) {
        ImageButton imageButton = r5.A04;
        AudioPickerActivity audioPickerActivity = r5.A0C;
        AnonymousClass3MY.A0w(audioPickerActivity, imageButton, 2131893587);
        imageButton.setBackground((Drawable) null);
        AnonymousClass3NL.A01(context, imageButton, audioPickerActivity.A00, 2131232164);
        AnonymousClass4aX.A0D(imageButton, AnonymousClass3Ma.A00(audioPickerActivity, 2130968705, 2131099794));
        r5.A0A.setVisibility(0);
    }

    public static void A01(Context context, AnonymousClass73R r5, boolean z) {
        CircularProgressBar circularProgressBar;
        int i;
        ImageButton imageButton = r5.A04;
        AudioPickerActivity audioPickerActivity = r5.A0C;
        AnonymousClass3MY.A0w(audioPickerActivity, imageButton, 2131899314);
        if (z) {
            imageButton.setBackground(AnonymousClass3NL.A00(context, audioPickerActivity.A00, 2131231032));
            AnonymousClass3NL.A01(context, imageButton, audioPickerActivity.A00, 2131232221);
            AnonymousClass4aX.A0D(imageButton, C19740yt.A00(audioPickerActivity, 2131099788));
            circularProgressBar = r5.A0A;
            i = 8;
        } else {
            imageButton.setBackground((Drawable) null);
            AnonymousClass3NL.A01(context, imageButton, audioPickerActivity.A00, 2131232221);
            AnonymousClass4aX.A0D(imageButton, AnonymousClass3Ma.A00(audioPickerActivity, 2130968705, 2131099794));
            circularProgressBar = r5.A0A;
            i = 0;
        }
        circularProgressBar.setVisibility(i);
    }

    public static void A02(View view, AnonymousClass73R r11) {
        String A0K;
        AnonymousClass1KB r8;
        String string;
        AudioPickerActivity audioPickerActivity = r11.A0C;
        C110295fF r1 = audioPickerActivity.A03;
        C130656jn A002 = C110295fF.A00((Cursor) r1.getItem(r11.A00), r1);
        if (A002 != null) {
            int A032 = C108975cc.A03(audioPickerActivity);
            if (audioPickerActivity.A0K.size() >= A032) {
                A032 = C18020vd.A00(C18040vf.A02, audioPickerActivity.A0E, 2693);
            }
            LinkedHashMap linkedHashMap = audioPickerActivity.A0K;
            if (linkedHashMap.size() >= A032 && !linkedHashMap.containsKey(Integer.valueOf(A002.A00))) {
                r8 = audioPickerActivity.A05;
                Object[] objArr = new Object[1];
                C17880vN.A1T(objArr, A032, 0);
                string = audioPickerActivity.A00.A0K(objArr, 2131755223, (long) A032);
            } else if (((long) A002.A01) >= C108995ce.A07(audioPickerActivity.A0E, 3657)) {
                r8 = audioPickerActivity.A05;
                Object[] objArr2 = new Object[1];
                C17880vN.A1T(objArr2, C18020vd.A00(C18040vf.A02, audioPickerActivity.A0E, 3657), 0);
                string = audioPickerActivity.getString(2131891905, objArr2);
            } else {
                int i = A002.A00;
                LinkedHashMap linkedHashMap2 = audioPickerActivity.A0K;
                Integer valueOf = Integer.valueOf(i);
                boolean containsKey = linkedHashMap2.containsKey(valueOf);
                r11.A03(A002, !containsKey);
                LinkedHashMap linkedHashMap3 = audioPickerActivity.A0K;
                if (containsKey) {
                    linkedHashMap3.remove(valueOf);
                    view.setSelected(false);
                    view.setBackgroundResource(0);
                    ((SelectionCheckView) view.findViewById(2131435130)).A04(false, true);
                } else {
                    linkedHashMap3.put(valueOf, A002);
                    view.setSelected(true);
                    view.setBackgroundResource(AnonymousClass1YL.A00(view.getContext(), 2130968701, 2131099789));
                    ((SelectionCheckView) view.findViewById(2131435130)).A04(true, true);
                }
                int size = audioPickerActivity.A0K.size();
                ImageButton imageButton = audioPickerActivity.A01;
                if (size == 0) {
                    AnonymousClass71W.A00(imageButton, false, true);
                    A0K = audioPickerActivity.getString(2131896777);
                } else {
                    AnonymousClass71W.A00(imageButton, true, true);
                    Object[] objArr3 = new Object[1];
                    C17880vN.A1T(objArr3, size, 0);
                    A0K = audioPickerActivity.A00.A0K(objArr3, 2131755264, (long) size);
                }
                C003401n supportActionBar = audioPickerActivity.getSupportActionBar();
                C17960vV.A08(supportActionBar, "supportActionBar is null");
                supportActionBar.A0R(A0K);
                return;
            }
            r8.A0G(string, 0);
        }
    }

    private void A03(C130656jn r11, boolean z) {
        int i;
        Object[] objArr;
        String str = r11.A02;
        View view = this.A02;
        AudioPickerActivity audioPickerActivity = this.A0C;
        if (str != null) {
            i = 2131886787;
            if (z) {
                i = 2131886789;
            }
            objArr = new Object[]{r11.A07, str, r11.A04, r11.A06};
        } else {
            int i2 = 2131886788;
            if (z) {
                i2 = 2131886790;
            }
            objArr = new Object[]{r11.A07, r11.A04, r11.A06};
        }
        view.setContentDescription(audioPickerActivity.getString(i, objArr));
    }

    public void A04(AnonymousClass1FU r20, C130656jn r21) {
        long A092;
        TextView textView;
        float f;
        View view = this.A02;
        AnonymousClass3MZ.A1J(view, this, 0);
        C1421478i.A00(view, this, 1);
        C130656jn r6 = r21;
        String str = r6.A03;
        File file = null;
        if (str != null) {
            file = C108945cZ.A17(str);
        }
        int i = r6.A00;
        AnonymousClass7HU r8 = new AnonymousClass7HU(this, (long) i);
        C144377Hb r1 = new C144377Hb(this);
        AudioPickerActivity audioPickerActivity = this.A0C;
        audioPickerActivity.A0C.A02(r8, r1);
        ImageView imageView = this.A05;
        imageView.setClipToOutline(true);
        AnonymousClass3MW.A1R(imageView);
        TextView textView2 = this.A09;
        AnonymousClass1FU r82 = r20;
        textView2.setText(C43351zf.A03(r82, audioPickerActivity.A00, r6.A07, audioPickerActivity.A0J));
        String str2 = r6.A02;
        TextView textView3 = this.A06;
        if (str2 != null) {
            textView3.setVisibility(0);
            textView3.setText(C43351zf.A03(r82, audioPickerActivity.A00, str2, audioPickerActivity.A0J));
        } else {
            textView3.setVisibility(8);
        }
        String str3 = r6.A05;
        boolean isEmpty = str3.isEmpty();
        TextView textView4 = this.A07;
        if (!isEmpty) {
            textView4.setVisibility(0);
            textView4.setText(str3);
        } else {
            textView4.setVisibility(8);
        }
        String str4 = r6.A06;
        boolean isEmpty2 = str4.isEmpty();
        if (!isEmpty2) {
            if (((long) r6.A01) >= C108995ce.A07(audioPickerActivity.A0E, 3657)) {
                SpannableString spannableString = new SpannableString(str4);
                spannableString.setSpan(new ForegroundColorSpan(-65536), 0, str4.length(), 33);
                textView = this.A08;
                textView.setText(spannableString, TextView.BufferType.SPANNABLE);
                f = 0.5f;
            } else {
                textView = this.A08;
                textView.setText(str4);
                f = 1.0f;
            }
            textView2.setAlpha(f);
            textView.setVisibility(0);
        } else {
            this.A08.setVisibility(8);
        }
        if (isEmpty || isEmpty2) {
            this.A01.setVisibility(8);
        } else {
            this.A01.setVisibility(0);
        }
        boolean containsKey = audioPickerActivity.A0K.containsKey(Integer.valueOf(i));
        if (containsKey) {
            view.setSelected(true);
            view.setBackgroundResource(AnonymousClass1YL.A00(view.getContext(), 2130968701, 2131099789));
            SelectionCheckView selectionCheckView = this.A0B;
            selectionCheckView.setVisibility(0);
            selectionCheckView.A04(true, false);
        } else {
            view.setBackgroundResource(0);
            SelectionCheckView selectionCheckView2 = this.A0B;
            selectionCheckView2.A04(false, false);
            selectionCheckView2.setVisibility(4);
        }
        A03(r6, containsKey);
        CircularProgressBar circularProgressBar = this.A0A;
        circularProgressBar.A0B = AnonymousClass3Ma.A00(r82, 2130968703, 2131099792);
        circularProgressBar.A0C = AnonymousClass3Ma.A00(r82, 2130968704, 2131099793);
        circularProgressBar.A05 = 0.1f;
        circularProgressBar.A06 = 10.0f;
        circularProgressBar.setIndeterminate(false);
        String num = Integer.toString(i);
        int i2 = C145777Mo.A15;
        C441822l r9 = new C441822l(new AnonymousClass205((AnonymousClass1BI) null, num, true), 0);
        r9.A09 = 2;
        C62572rc r0 = new C62572rc();
        r0.A0G = file;
        r9.A02 = r0;
        if (!audioPickerActivity.A0B.A0D(r9)) {
            A01(r82, this, true);
            circularProgressBar.setMax(r9.A0D * 1000);
            circularProgressBar.setProgress(0);
            A092 = 0;
        } else {
            C145777Mo A002 = audioPickerActivity.A0B.A00();
            if (A002 != null) {
                circularProgressBar.setMax(A002.A01);
                if (A002.A0I()) {
                    A00(r82, this);
                } else if (A002.A09() > 0) {
                    A01(r82, this, false);
                } else {
                    A01(r82, this, true);
                    circularProgressBar.setProgress(0);
                    circularProgressBar.setMax(A002.A01);
                    A002.A0H = new AnonymousClass7EY(r82, this, A002, r9);
                    A092 = (long) A002.A09();
                }
                circularProgressBar.setProgress(A002.A09());
                circularProgressBar.setMax(A002.A01);
                A002.A0H = new AnonymousClass7EY(r82, this, A002, r9);
                A092 = (long) A002.A09();
            }
            AnonymousClass1FU r11 = r82;
            this.A04.setOnClickListener(new AnonymousClass78E(this, r9, r6, r11, 0));
        }
        circularProgressBar.setContentDescription(C17890vO.A0R(audioPickerActivity, C64052u8.A07(audioPickerActivity.A00, A092), 1, 0, 2131898071));
        AnonymousClass1FU r112 = r82;
        this.A04.setOnClickListener(new AnonymousClass78E(this, r9, r6, r112, 0));
    }
}
