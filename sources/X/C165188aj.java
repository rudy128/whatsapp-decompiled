package X;

/* renamed from: X.8aj  reason: invalid class name and case insensitive filesystem */
public final class C165188aj extends C23577Bm6 implements C22356B4k {
    public static final C165188aj DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int PROMPT_SUGGESTIONS_FIELD_NUMBER = 3;
    public static final int SELECTED_PROMPT_ID_FIELD_NUMBER = 4;
    public static final int SELECTED_PROMPT_INDEX_FIELD_NUMBER = 2;
    public static final int SUGGESTED_PROMPTS_FIELD_NUMBER = 1;
    public int bitField0_;
    public AnonymousClass8XE promptSuggestions_;
    public String selectedPromptId_ = "";
    public int selectedPromptIndex_;
    public EE9 suggestedPrompts_ = C23579Bm9.A02;

    static {
        C165188aj r1 = new C165188aj();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165188aj.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1a = AnonymousClass8BW.A1a();
                A1a[1] = "suggestedPrompts_";
                A1a[2] = "selectedPromptIndex_";
                A1a[3] = "promptSuggestions_";
                A1a[4] = "selectedPromptId_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001a\u0002ဋ\u0000\u0003ဉ\u0001\u0004ဈ\u0002", A1a);
            case 3:
                return new C165188aj();
            case 4:
                return new AnonymousClass8S1();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165188aj.class) {
                    b4l = PARSER;
                    if (b4l == null) {
                        C26105CsP csP = DNE.A01;
                        b4l = C17880vN.A0F(DEFAULT_INSTANCE);
                        PARSER = b4l;
                    }
                }
                return b4l;
            default:
                throw C17880vN.A0y();
        }
    }
}
