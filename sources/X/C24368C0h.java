package X;

import com.facebook.dsp.core.typography.ThemeTypeface;

/* renamed from: X.C0h  reason: case insensitive filesystem */
public enum C24368C0h implements ThemeTypeface {
    OPTIMISTIC_DISPLAY_APP("Optimistic Display App"),
    OPTIMISTIC_DISPLAY_APP_MEDIUM("Optimistic Display App Medium"),
    OPTIMISTIC_TEXT_APP("Optimistic Text App Regular"),
    OPTIMISTIC_TEXT_APP_REGULAR("Optimistic Text App Regular"),
    OPTIMISTIC_TEXT_APP_MEDIUM("Optimistic Text App Medium"),
    OPTIMISTIC_TEXT_APP_BOLD("Optimistic Text App Bold"),
    OPTIMISTIC_VF_APP_LITE("Optimistic VF App Lite"),
    SANS_SERIF("sans-serif"),
    SANS_SERIF_MEDIUM("sans-serif-medium");
    
    public final String value;

    /* access modifiers changed from: public */
    static {
        C24368C0h[] c0hArr;
        A00 = C19780yz.A00(c0hArr);
    }

    public String getValue() {
        return this.value;
    }

    /* access modifiers changed from: public */
    C24368C0h(String str) {
        this.value = str;
    }
}
