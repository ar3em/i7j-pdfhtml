/*
    This file is part of the iText (R) project.
    Copyright (c) 1998-2021 iText Group NV
    Authors: iText Software.

    This program is offered under a commercial and under the AGPL license.
    For commercial licensing, contact us at https://itextpdf.com/sales.  For AGPL licensing, see below.

    AGPL licensing:
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.itextpdf.html2pdf.actions.data;

import com.itextpdf.kernel.actions.ProductNameConstant;
import com.itextpdf.kernel.actions.data.ProductData;

/**
 * Stores an instance of {@link ProductData} related to iText pdfHTML module.
 */
public class PdfHtmlProductData {
    private static final String PDF_HTML_PUBLIC_PRODUCT_NAME = "pdfHTML";
    private static final String PDF_HTML_VERSION = "3.0.5-SNAPSHOT";
    private static final int PDF_HTML_COPYRIGHT_SINCE = 1998;
    private static final int PDF_HTML_COPYRIGHT_TO = 2021;

    private static final ProductData PDF_HTML_PRODUCT_DATA = new ProductData(PDF_HTML_PUBLIC_PRODUCT_NAME,
            ProductNameConstant.PDF_HTML, PDF_HTML_VERSION, PDF_HTML_COPYRIGHT_SINCE, PDF_HTML_COPYRIGHT_TO);

    /**
     * Getter for an instance of {@link ProductData} related to iText pdfHTML module.
     *
     * @return iText pdfHTML product description
     */
    public static ProductData getInstance() {
        return PDF_HTML_PRODUCT_DATA;
    }
}