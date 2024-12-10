package com.facebook.cameracore.ardelivery.model;

import X.AD6;
import X.AnonymousClass000;
import X.AnonymousClass1IX;
import X.C108955ca;
import X.C17880vN;
import X.C17890vO;
import X.C26208Cuj;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AREffectAsyncAsset implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AD6(10);
    public final String mCacheKey;
    public final ARRequestAsset$CompressionMethod mCompressionMethod;
    public final String mId;
    public final boolean mIsLoggingDisabled;
    public final List mStringIdentifiers;
    public final String mUri;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AREffectAsyncAsset)) {
            return false;
        }
        AREffectAsyncAsset aREffectAsyncAsset = (AREffectAsyncAsset) obj;
        return this.mId.equals(aREffectAsyncAsset.mId) && this.mCacheKey.equals(aREffectAsyncAsset.mCacheKey) && this.mStringIdentifiers.equals(aREffectAsyncAsset.mStringIdentifiers) && this.mUri.equals(aREffectAsyncAsset.mUri) && this.mCompressionMethod == aREffectAsyncAsset.mCompressionMethod && this.mIsLoggingDisabled == aREffectAsyncAsset.mIsLoggingDisabled;
    }

    public int getCompressionMethodForNative() {
        return ARRequestAsset$CompressionMethod.toXplatCompressionType(this.mCompressionMethod).mCppValue;
    }

    public String[] getFileNamesForNative() {
        return C108955ca.A1b(this.mStringIdentifiers);
    }

    public AnonymousClass1IX getStringIdentifiers() {
        return AnonymousClass1IX.copyOf((Collection) this.mStringIdentifiers);
    }

    public int hashCode() {
        int A03 = C17880vN.A03(this.mId);
        return AnonymousClass000.A0N(this.mCompressionMethod, C17890vO.A02(this.mUri, (C17890vO.A02(this.mCacheKey, A03) + this.mStringIdentifiers.hashCode()) * 31)) + (this.mIsLoggingDisabled ? 1 : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mCacheKey);
        parcel.writeStringList(this.mStringIdentifiers);
        parcel.writeString(this.mUri);
        parcel.writeSerializable(this.mCompressionMethod);
        parcel.writeByte(this.mIsLoggingDisabled ? (byte) 1 : 0);
    }

    public AREffectAsyncAsset(Parcel parcel) {
        String readString = parcel.readString();
        C26208Cuj.A01(readString);
        this.mId = readString;
        String readString2 = parcel.readString();
        C26208Cuj.A01(readString2);
        this.mCacheKey = readString2;
        ArrayList A13 = AnonymousClass000.A13();
        this.mStringIdentifiers = A13;
        parcel.readStringList(A13);
        String readString3 = parcel.readString();
        C26208Cuj.A01(readString3);
        this.mUri = readString3;
        Serializable readSerializable = parcel.readSerializable();
        C26208Cuj.A01(readSerializable);
        this.mCompressionMethod = (ARRequestAsset$CompressionMethod) readSerializable;
        this.mIsLoggingDisabled = AnonymousClass000.A1O(parcel.readByte());
    }

    public String getCacheKey() {
        return this.mCacheKey;
    }

    public ARRequestAsset$CompressionMethod getCompressionMethod() {
        return this.mCompressionMethod;
    }

    public String getId() {
        return this.mId;
    }

    public String getUri() {
        return this.mUri;
    }

    public boolean isLoggingDisabled() {
        return this.mIsLoggingDisabled;
    }

    public AREffectAsyncAsset(String str, String str2, List list, String str3, ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod, boolean z) {
        C26208Cuj.A02(str, "async asset id cannot be null");
        this.mId = str;
        C26208Cuj.A02(str2, "async asset cache key cannot be null");
        this.mCacheKey = str2;
        this.mStringIdentifiers = list;
        this.mUri = str3;
        this.mCompressionMethod = aRRequestAsset$CompressionMethod;
        this.mIsLoggingDisabled = z;
    }
}
