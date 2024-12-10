package X;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.content.res.loader.ResourcesLoader;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.26e  reason: invalid class name and case insensitive filesystem */
public final class C451126e extends Resources {
    public boolean A00;
    public final Resources A01;
    public final C72023Ki A02;
    public final Map A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C451126e(AssetManager assetManager, Configuration configuration, Resources resources, DisplayMetrics displayMetrics, C72023Ki r6, Map map) {
        super(assetManager, displayMetrics, configuration);
        C18070vi.A0d(r6, 2);
        this.A01 = resources;
        this.A02 = r6;
        this.A03 = map;
    }

    public void addLoaders(ResourcesLoader... resourcesLoaderArr) {
        C18070vi.A0d(resourcesLoaderArr, 0);
        this.A01.addLoaders((ResourcesLoader[]) Arrays.copyOf(resourcesLoaderArr, resourcesLoaderArr.length));
    }

    public void removeLoaders(ResourcesLoader... resourcesLoaderArr) {
        C18070vi.A0d(resourcesLoaderArr, 0);
        this.A01.removeLoaders((ResourcesLoader[]) Arrays.copyOf(resourcesLoaderArr, resourcesLoaderArr.length));
    }

    private final CharSequence A00(C18090vk r3, int i) {
        CharSequence BM9;
        String str = (String) AnonymousClass000.A0w(this.A03, i);
        if (str == null || (BM9 = this.A02.BM9(str)) == null) {
            return (CharSequence) r3.invoke();
        }
        return BM9;
    }

    public XmlResourceParser getAnimation(int i) {
        XmlResourceParser animation = this.A01.getAnimation(i);
        C18070vi.A0X(animation);
        return animation;
    }

    public boolean getBoolean(int i) {
        return this.A01.getBoolean(i);
    }

    public int getColor(int i) {
        return this.A01.getColor(i);
    }

    public ColorStateList getColorStateList(int i) {
        ColorStateList colorStateList = this.A01.getColorStateList(i);
        C18070vi.A0X(colorStateList);
        return colorStateList;
    }

    public Configuration getConfiguration() {
        Configuration configuration = this.A01.getConfiguration();
        C18070vi.A0X(configuration);
        return configuration;
    }

    public float getDimension(int i) {
        return this.A01.getDimension(i);
    }

    public int getDimensionPixelOffset(int i) {
        return this.A01.getDimensionPixelOffset(i);
    }

    public int getDimensionPixelSize(int i) {
        return this.A01.getDimensionPixelSize(i);
    }

    public DisplayMetrics getDisplayMetrics() {
        DisplayMetrics displayMetrics = this.A01.getDisplayMetrics();
        C18070vi.A0X(displayMetrics);
        return displayMetrics;
    }

    public Drawable getDrawable(int i) {
        Drawable drawable = this.A01.getDrawable(i);
        C18070vi.A0X(drawable);
        return drawable;
    }

    public Drawable getDrawableForDensity(int i, int i2) {
        return this.A01.getDrawableForDensity(i, i2);
    }

    public float getFloat(int i) {
        return this.A01.getFloat(i);
    }

    public Typeface getFont(int i) {
        Typeface font = this.A01.getFont(i);
        C18070vi.A0X(font);
        return font;
    }

    public float getFraction(int i, int i2, int i3) {
        return this.A01.getFraction(i, i2, i3);
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.A01.getIdentifier(str, str2, str3);
    }

    public int[] getIntArray(int i) {
        int[] intArray = this.A01.getIntArray(i);
        C18070vi.A0X(intArray);
        return intArray;
    }

    public int getInteger(int i) {
        return this.A01.getInteger(i);
    }

    public XmlResourceParser getLayout(int i) {
        XmlResourceParser layout = this.A01.getLayout(i);
        C18070vi.A0X(layout);
        return layout;
    }

    public Movie getMovie(int i) {
        Movie movie = this.A01.getMovie(i);
        C18070vi.A0X(movie);
        return movie;
    }

    public String getQuantityString(int i, int i2) {
        String quantityString = this.A01.getQuantityString(i, i2);
        C18070vi.A0X(quantityString);
        return quantityString;
    }

    public CharSequence getQuantityText(int i, int i2) {
        CharSequence quantityText = this.A01.getQuantityText(i, i2);
        C18070vi.A0X(quantityText);
        return quantityText;
    }

    public String getResourceEntryName(int i) {
        String resourceEntryName = this.A01.getResourceEntryName(i);
        C18070vi.A0X(resourceEntryName);
        return resourceEntryName;
    }

    public String getResourceName(int i) {
        String resourceName = this.A01.getResourceName(i);
        C18070vi.A0X(resourceName);
        return resourceName;
    }

    public String getResourcePackageName(int i) {
        String resourcePackageName = this.A01.getResourcePackageName(i);
        C18070vi.A0X(resourcePackageName);
        return resourcePackageName;
    }

    public String getResourceTypeName(int i) {
        String resourceTypeName = this.A01.getResourceTypeName(i);
        C18070vi.A0X(resourceTypeName);
        return resourceTypeName;
    }

    public String getString(int i) {
        return A00(new C71523Hi(this, i), i).toString();
    }

    public String[] getStringArray(int i) {
        String[] stringArray = this.A01.getStringArray(i);
        C18070vi.A0X(stringArray);
        return stringArray;
    }

    public CharSequence getText(int i) {
        return A00(new C71533Hj(this, i), i);
    }

    public CharSequence[] getTextArray(int i) {
        CharSequence[] textArray = this.A01.getTextArray(i);
        C18070vi.A0X(textArray);
        return textArray;
    }

    public void getValue(int i, TypedValue typedValue, boolean z) {
        this.A01.getValue(i, typedValue, z);
    }

    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.A01.getValueForDensity(i, i2, typedValue, z);
    }

    public XmlResourceParser getXml(int i) {
        XmlResourceParser xml = this.A01.getXml(i);
        C18070vi.A0X(xml);
        return xml;
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        TypedArray obtainAttributes = this.A01.obtainAttributes(attributeSet, iArr);
        C18070vi.A0X(obtainAttributes);
        return obtainAttributes;
    }

    public TypedArray obtainTypedArray(int i) {
        TypedArray obtainTypedArray = this.A01.obtainTypedArray(i);
        C18070vi.A0X(obtainTypedArray);
        return obtainTypedArray;
    }

    public InputStream openRawResource(int i) {
        InputStream openRawResource = this.A01.openRawResource(i);
        C18070vi.A0X(openRawResource);
        return openRawResource;
    }

    public AssetFileDescriptor openRawResourceFd(int i) {
        AssetFileDescriptor openRawResourceFd = this.A01.openRawResourceFd(i);
        C18070vi.A0X(openRawResourceFd);
        return openRawResourceFd;
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.A01.parseBundleExtra(str, attributeSet, bundle);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.A01.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        try {
            this.A01.updateConfiguration(configuration, displayMetrics);
            this.A00 = true;
        } catch (NullPointerException unused) {
            C17890vO.A0D().post(new C27081DTg(this, configuration, displayMetrics, 25));
        }
    }

    public int getColor(int i, Resources.Theme theme) {
        return this.A01.getColor(i, theme);
    }

    public ColorStateList getColorStateList(int i, Resources.Theme theme) {
        ColorStateList colorStateList = this.A01.getColorStateList(i, theme);
        C18070vi.A0X(colorStateList);
        return colorStateList;
    }

    public Drawable getDrawable(int i, Resources.Theme theme) {
        Drawable drawable = this.A01.getDrawable(i, theme);
        C18070vi.A0X(drawable);
        return drawable;
    }

    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.A01.getDrawableForDensity(i, i2, theme);
    }

    public String getQuantityString(int i, int i2, Object... objArr) {
        C18070vi.A0d(objArr, 2);
        String quantityString = this.A01.getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
        C18070vi.A0X(quantityString);
        return quantityString;
    }

    public String getString(int i, Object... objArr) {
        C18070vi.A0d(objArr, 1);
        String string = this.A01.getString(i, Arrays.copyOf(objArr, objArr.length));
        C18070vi.A0X(string);
        return string;
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        return A00(new C71633Ht(this, charSequence, i), i);
    }

    public void getValue(String str, TypedValue typedValue, boolean z) {
        this.A01.getValue(str, typedValue, z);
    }

    public InputStream openRawResource(int i, TypedValue typedValue) {
        InputStream openRawResource = this.A01.openRawResource(i, typedValue);
        C18070vi.A0X(openRawResource);
        return openRawResource;
    }
}
