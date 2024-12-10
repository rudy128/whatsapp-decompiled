package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;

/* renamed from: X.03k  reason: invalid class name and case insensitive filesystem */
public class C007603k extends EditText implements C27761Xl, AnonymousClass1XX {
    public AnonymousClass0IZ A00;
    public final AnonymousClass03U A01;
    public final AnonymousClass0KN A02;
    public final C007703l A03;
    public final C007103e A04;
    public final D6U A05;

    public static boolean A02(View view, DragEvent dragEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && AnonymousClass1HF.A0w(view) != null) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity != null) {
                        if (dragEvent.getAction() == 1) {
                            return !(view instanceof TextView);
                        }
                        if (dragEvent.getAction() == 3) {
                            if (view instanceof TextView) {
                                return C03730Kk.A01(activity, dragEvent, (TextView) view);
                            }
                            return C03730Kk.A00(activity, dragEvent, view);
                        }
                    }
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Can't handle drop: no activity: view=");
            sb.append(view);
            Log.i("ReceiveContent", sb.toString());
        }
        return false;
    }

    public static boolean A03(TextView textView, int i) {
        ClipData primaryClip;
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 31 || AnonymousClass1HF.A0w(textView) == null || (i != 16908322 && i != 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            primaryClip = null;
        } else {
            primaryClip = clipboardManager.getPrimaryClip();
        }
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            C25709Ckf ckf = new C25709Ckf(primaryClip, 1);
            if (i != 16908322) {
                i2 = 1;
            }
            ckf.A01(i2);
            AnonymousClass1HF.A0A(textView, ckf.A00());
        }
        return true;
    }

    private AnonymousClass0IZ getSuperCaller() {
        AnonymousClass0IZ r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0IZ r02 = new AnonymousClass0IZ(this);
        this.A00 = r02;
        return r02;
    }

    public C25997CqD C2b(C25997CqD cqD) {
        return this.A05.C2a(this, cqD);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C007903o r0;
        AnonymousClass03U r02 = this.A01;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A00;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C007903o r0;
        AnonymousClass03U r02 = this.A01;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A01;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C007903o r0 = this.A04.A07;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C007903o r0 = this.A04.A07;
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public TextClassifier getTextClassifier() {
        C007703l r0;
        if (Build.VERSION.SDK_INT >= 28 || (r0 = this.A03) == null) {
            return getSuperCaller().A00();
        }
        return r0.A00();
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.A02.A03(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.A02.A00(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AnonymousClass03U r0 = this.A01;
        if (r0 != null) {
            r0.A04(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AnonymousClass03U r0 = this.A01;
        if (r0 != null) {
            r0.A05(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C007103e r0 = this.A04;
        r0.A0A(colorStateList);
        r0.A08();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C007103e r0 = this.A04;
        r0.A0B(mode);
        r0.A08();
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C007703l r0;
        if (Build.VERSION.SDK_INT >= 28 || (r0 = this.A03) == null) {
            getSuperCaller().A01(textClassifier);
        } else {
            r0.A01(textClassifier);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.03l] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C007603k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        AnonymousClass03T.A04(getContext(), this);
        AnonymousClass03U r0 = new AnonymousClass03U(this);
        this.A01 = r0;
        r0.A06(attributeSet, i);
        C007103e r02 = new C007103e(this);
        this.A04 = r02;
        r02.A0C(attributeSet, i);
        r02.A08();
        ? obj = new Object();
        obj.A00 = this;
        this.A03 = obj;
        this.A05 = new D6U();
        AnonymousClass0KN r6 = new AnonymousClass0KN(this);
        this.A02 = r6;
        r6.A02(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener A002 = r6.A00(keyListener);
            if (A002 != keyListener) {
                super.setKeyListener(A002);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass03U r0 = this.A01;
        if (r0 != null) {
            r0.A01();
        }
        C007103e r02 = this.A04;
        if (r02 != null) {
            r02.A08();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C29261bv.A00(super.getCustomSelectionActionModeCallback());
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] A0w;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C007103e.A05(editorInfo, onCreateInputConnection, this);
        AnonymousClass0D8.A00(this, editorInfo, onCreateInputConnection);
        if (!(onCreateInputConnection == null || Build.VERSION.SDK_INT > 30 || (A0w = AnonymousClass1HF.A0w(this)) == null)) {
            EditorInfoCompat.setContentMimeTypes(editorInfo, A0w);
            onCreateInputConnection = InputConnectionCompat.createWrapper((View) this, onCreateInputConnection, editorInfo);
        }
        return this.A02.A01(onCreateInputConnection);
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (A02(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i) {
        if (A03(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AnonymousClass03U r0 = this.A01;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AnonymousClass03U r0 = this.A01;
        if (r0 != null) {
            r0.A03(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C007103e r0 = this.A04;
        if (r0 != null) {
            r0.A08();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C007103e r0 = this.A04;
        if (r0 != null) {
            r0.A08();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C29261bv.A01(callback, this));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C007103e r0 = this.A04;
        if (r0 != null) {
            r0.A09(context, i);
        }
    }

    public C007603k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969419);
    }
}
