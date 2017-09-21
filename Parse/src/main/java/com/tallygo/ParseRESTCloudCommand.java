/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.tallygo;

import com.tallygo.http.ParseHttpRequest;

import java.util.Map;

/** package */ class ParseRESTCloudCommand extends ParseRESTCommand {

  private ParseRESTCloudCommand(
      String httpPath,
      ParseHttpRequest.Method httpMethod,
      Map<String, ?> parameters,
      String sessionToken) {
    super(httpPath, httpMethod, parameters, sessionToken);
  }

  public static ParseRESTCloudCommand callFunctionCommand(String functionName,
      Map<String, ?> parameters, String sessionToken) {
    final String httpPath = String.format("functions/%s", functionName);
    return new ParseRESTCloudCommand(
        httpPath, ParseHttpRequest.Method.POST, parameters, sessionToken);
  }
}
