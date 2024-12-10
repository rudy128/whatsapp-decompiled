package X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

/* renamed from: X.0va  reason: invalid class name and case insensitive filesystem */
public class C17990va extends Resources {
    public final Resources A00;
    public final C18000vb A01;

    public XmlResourceParser getAnimation(int i) {
        return this.A00.getAnimation(i);
    }

    public boolean getBoolean(int i) {
        return this.A00.getBoolean(i);
    }

    public int getColor(int i) {
        return this.A00.getColor(i);
    }

    public ColorStateList getColorStateList(int i) {
        return this.A00.getColorStateList(i);
    }

    public Configuration getConfiguration() {
        return this.A00.getConfiguration();
    }

    public float getDimension(int i) {
        return this.A00.getDimension(i);
    }

    public int getDimensionPixelOffset(int i) {
        return this.A00.getDimensionPixelOffset(i);
    }

    public int getDimensionPixelSize(int i) {
        return this.A00.getDimensionPixelSize(i);
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.A00.getDisplayMetrics();
    }

    public Drawable getDrawable(int i) {
        return this.A00.getDrawable(i);
    }

    public Drawable getDrawableForDensity(int i, int i2) {
        return this.A00.getDrawableForDensity(i, i2);
    }

    public float getFloat(int i) {
        return this.A00.getFloat(i);
    }

    public Typeface getFont(int i) {
        return this.A00.getFont(i);
    }

    public float getFraction(int i, int i2, int i3) {
        return this.A00.getFraction(i, i2, i3);
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.A00.getIdentifier(str, str2, str3);
    }

    public int[] getIntArray(int i) {
        return this.A00.getIntArray(i);
    }

    public int getInteger(int i) {
        return this.A00.getInteger(i);
    }

    public XmlResourceParser getLayout(int i) {
        return this.A00.getLayout(i);
    }

    public Movie getMovie(int i) {
        return this.A00.getMovie(i);
    }

    public String getQuantityString(int i, int i2) {
        return this.A01.A0D((long) i2, i);
    }

    public CharSequence getQuantityText(int i, int i2) {
        return this.A01.A0D((long) i2, i);
    }

    public String getResourceEntryName(int i) {
        return this.A00.getResourceEntryName(i);
    }

    public String getResourceName(int i) {
        String resourceName = this.A00.getResourceName(i);
        if (resourceName == null || !resourceName.endsWith("(name removed)")) {
            return resourceName;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(resourceName);
        sb.append(" (ID 0x");
        sb.append(Integer.toHexString(i));
        sb.append(")");
        return sb.toString();
    }

    public String getResourcePackageName(int i) {
        return this.A00.getResourcePackageName(i);
    }

    public String getResourceTypeName(int i) {
        return this.A00.getResourceTypeName(i);
    }

    public String getString(int i) {
        return this.A01.A09(i);
    }

    public String[] getStringArray(int i) {
        return this.A00.getStringArray(i);
    }

    public CharSequence getText(int i) {
        return this.A01.A09(i);
    }

    public CharSequence[] getTextArray(int i) {
        return this.A00.getTextArray(i);
    }

    public void getValue(int i, TypedValue typedValue, boolean z) {
        this.A00.getValue(i, typedValue, z);
    }

    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.A00.getValueForDensity(i, i2, typedValue, z);
    }

    public XmlResourceParser getXml(int i) {
        return this.A00.getXml(i);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.A00.obtainAttributes(attributeSet, iArr);
    }

    public TypedArray obtainTypedArray(int i) {
        return this.A00.obtainTypedArray(i);
    }

    public InputStream openRawResource(int i) {
        return this.A00.openRawResource(i);
    }

    public AssetFileDescriptor openRawResourceFd(int i) {
        return this.A00.openRawResourceFd(i);
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.A00.parseBundleExtra(str, attributeSet, bundle);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.A00.parseBundleExtras(xmlResourceParser, bundle);
    }

    public C17990va(Context context, C18000vb r5) {
        super(context.getResources().getAssets(), context.getResources().getDisplayMetrics(), context.getResources().getConfiguration());
        this.A00 = context.getResources();
        this.A01 = r5;
    }

    public static C17990va A00(Context context, C18000vb r2) {
        if (context.getResources() instanceof C17990va) {
            return (C17990va) context.getResources();
        }
        return new C17990va(context, r2);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.A00;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    public int getColor(int i, Resources.Theme theme) {
        return this.A00.getColor(i, theme);
    }

    public ColorStateList getColorStateList(int i, Resources.Theme theme) {
        return this.A00.getColorStateList(i, theme);
    }

    public Drawable getDrawable(int i, Resources.Theme theme) {
        return this.A00.getDrawable(i, theme);
    }

    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.A00.getDrawableForDensity(i, i2, theme);
    }

    public String getQuantityString(int i, int i2, Object... objArr) {
        return this.A01.A0K(objArr, i, (long) i2);
    }

    public String getString(int i, Object... objArr) {
        return this.A01.A0C(i, objArr);
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        String A09;
        if (i == 0 || (A09 = this.A01.A09(i)) == null) {
            return charSequence;
        }
        return A09;
    }

    public void getValue(String str, TypedValue typedValue, boolean z) {
        this.A00.getValue(str, typedValue, z);
    }

    public InputStream openRawResource(int i, TypedValue typedValue) {
        return this.A00.openRawResource(i, typedValue);
    }
}
