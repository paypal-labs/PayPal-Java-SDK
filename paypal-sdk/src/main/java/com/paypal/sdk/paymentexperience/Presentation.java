// This class was generated on Tue, 23 Jan 2018 14:59:52 PST by version 0.1.0-dev+c58b80 of Braintree SDK Generator
// Presentation.java
// @version 0.1.0-dev+c58b80
// @type object
// @data H4sIAAAAAAAC/8xU34/jNBB+568Y5QWQutEdEiD61rs92GVPu1XbhQeEkqkzjX04tplx2s2i+9+RnbTX3j7wgIR4+eSM58f3zYzzV7EZAhXzYskk5CJG410xK35BNri1dI9dui1mxR0Nnz6uSRSbkJ3nxUYTSBwsAboGwlkmCMjYUSSWspgVC2YcxoKvZsWKsHlwdijmO7RCyfBnb5iak2HJPhBHQ1LMfztRlcjGtS9JbhldU7n0cU73wnxJfAEWt2Qhaozg98RsGhKImmDbi3EkAikQjMvGJQ5LtIBK+d5F8BfWgC1JCW81MqpIDJZcG3XuiTWdGTsic3j9zfcgxrWWrrZDJEAbNLq+IzYK1DH8XzfM9dZ+nP1j16xXaKlSvrls26X95cDHe/C7UfjYw4t2DB25CPQUiA05RdAYCRYHKWEBe7SmSdgTGIF68VjPoF5sEr55l3GV8O0i403G+4TX+fbdOuFPbxL+mD1vc+z9+4TLEbNllTJ7hvpxXafK316degxJXSqPVvxEaecZLLq2z6rGwQtBnjgbkjnUDVbXdym1puo2VzJNdXudDh+w+nmZDs5X9w/pEGI1KuG+ylRq2VfrrCHqapOFPetq1Pasq5u7ie6zrja/1v/ZFrS+Mh22ny/Bmfnzt/O4eg/R55knP8h+n2bbUWMQ4hDGAZet2SWJ5YfQTgrL4Nq6hLRNOfZLgQ6fTNd3cDBN1Cnu9Q+vIJgnspIf0vFek2l1TA7fHe/L4+Yp9kHGjNNaIhNY5Jb45BQsKhIYfM9n7GHa4ehD2ux0VMgRmPaGDikPnjIwKd915JqpyOB7kOiZctiYzjtAEFI9E3x1s9ks11+DEO8TkYeoiQ9GaAYH2sKW/UGI5fhKAKEjkZQlp1ea1B++j9NzU95FNA6cd1dTAROp+9/9gH7/+MXfAAAA//8=
// DO NOT EDIT
package com.paypal.sdk.paymentexperience;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The style and presentation parameters.
 */
@Model
public class Presentation {

    // Required default constructor
    public Presentation() {}

	/**
	* A label that overrides the business name in the PayPal account on the PayPal pages. Character length and limitations: 127 single-byte alphanumeric characters.
	*/
	@SerializedName("brand_name")
	private String brandName;

	public String brandName() { return brandName; }
	
	public Presentation brandName(String brandName) {
	    this.brandName = brandName;
	    return this;
	}

	/**
	* The locale of pages that the PayPal payment experience displays. A valid value is `AU`, `AT`, `BE`, `BR`, `CA`, `CH`, `CN`, `DE`, `ES`, `GB`, `FR`, `IT`, `NL`, `PL`, `PT`, `RU`, or `US`. A 5-character code is also valid for languages in these countries: `da_DK`, `he_IL`, `id_ID`, `ja_JP`, `no_NO`, `pt_BR`, `ru_RU`, `sv_SE`, `th_TH`, `zh_CN`, `zh_HK`, or `zh_TW`.
	*/
	@SerializedName("locale_code")
	private String localeCode;

	public String localeCode() { return localeCode; }
	
	public Presentation localeCode(String localeCode) {
	    this.localeCode = localeCode;
	    return this;
	}

	/**
	* A URL to the logo image. A valid media type is `.gif`, `.jpg`, or `.png`. The image's maximum width is 190 pixels and maximum height is 60 pixels. PayPal crops images that are larger. PayPal places your logo image at the top of the cart review area. PayPal recommends that you store the image on a secure (HTTPS) server. Otherwise, web browsers display a message that checkout pages contain non-secure items. Character length and limitations: 127 single-byte alphanumeric characters.
	*/
	@SerializedName("logo_image")
	private String logoImage;

	public String logoImage() { return logoImage; }
	
	public Presentation logoImage(String logoImage) {
	    this.logoImage = logoImage;
	    return this;
	}
}
