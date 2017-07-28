package com;

public class B {
	
		static String[] words;
		 String[] k;
		void arrange(String string) {

			words = string.split("\\|");

			for (int j = 0; j <= words.length - 1; j++) {

				k = words[j].split("~");

				if (k.length >= 2) {

					if (!(k[1].contains("^$^"))) {
						System.out.println(k[0]);
						System.out.println(k[1]);
					}

					if (k[1].contains("^$^")) {

						String[] n = k[1].split("\\^\\$\\^");
						
						
						System.out.println(n[n.length - 1]);

					}

				}

			}

		}
	
	
	public static void main(String[] args) throws Exception {
		B b=new B();

		String[] string = {
				"TCOrder~1|RESTAPIFolder~General Tasks|waitForCompletion~0|usecase~datacenter@CREATE-Admin|Type~XML|METHOD~POST|Request~/cloupia/api-v2/datacenter?<cuicOperationRequest><payload><![CDATA[<datacenter><dcName>Pod Test</dcName><description>api-auto</description><location>sdk</location><podType>FlexPod</podType><clusterSiteId></clusterSiteId><siteName></siteName><leafCUICID></leafCUICID><hidden></hidden></datacenter>]]></payload></cuicOperationRequest>^$^Description#datacenter@CREATE^$^OperationType#CREATE^$^Response##operationStatus#0: /cloupia/api-v2/datacenter?<cuicOperationRequest><payload><![CDATA[<datacenter><dcName>Pod Test</dcName><description>api-auto</description><location>sdk</location><podType>FlexPod</podType><clusterSiteId></clusterSiteId><siteName></siteName><leafCUICID></leafCUICID><hidden></hidden></datacenter>]]></payload></cuicOperationRequest>^$^Description#datacenter@CREATE^$^OperationType#CREATE^$^Response##operationStatus#0",
				"TCOrder~1|RESTAPIFolder~Legacy Tasks|waitForCompletion~0|usecase~userAPICreateCatalogItem-StandardCatalog|Type~JSON|METHOD~POST|Request~/app/api/rest?formatType=json&opName=userAPICreateCatalogItem&opData={param0:{\"catalogItemId\":-1,\"catalogItemName\":\"sdkcat\",\"catalogItemDescription\":\"For testing\",\"cloudName\":\"vc169\",\"imageId\":\"tempvm1\",\"groups\":\"Default Group\",\"isAppliedToAllGroups\":true,\"supportEmail\":\"sample\",\"vdcCategoryId\":1,\"appList\":null,\"otherApps\":null,\"os\":-1,\"otherOS\":null,\"templateUser\":null,\"templatePassword\":null,\"credentialOption\":1}}^$^Description#userAPIGlobal@userAPICreateCatalogItem: /app/api/rest?formatType=json&opName=userAPICreateCatalogItem&opData={param0:{\"catalogItemId\":-1,\"catalogItemName\":\"sdkcat\",\"catalogItemDescription\":\"For testing\",\"cloudName\":\"vc169\",\"imageId\":\"tempvm1\",\"groups\":\"Default Group\",\"isAppliedToAllGroups\":true,\"supportEmail\":\"sample\",\"vdcCategoryId\":1,\"appList\":null,\"otherApps\":null,\"os\":-1,\"otherOS\":null,\"templateUser\":null,\"templatePassword\":null,\"credentialOption\":1}}^$^Description#userAPIGlobal@userAPICreateCatalogItem",
				"TCOrder~1|RESTAPIFolder~Legacy Tasks|waitForCompletion~0|usecase~userAPIGetAllCatalogs-Admin|Type~JSON|METHOD~POST|Request~/app/api/rest?formatType=json&opName=userAPIGetAllCatalogs&opData={}^$^Description#userAPIGlobal@userAPIGetAllCatalogs: /app/api/rest?formatType=json&opName=userAPIGetAllCatalogs&opData={}^$^Description#userAPIGlobal@userAPIGetAllCatalogs",
				"TCOrder~1|RESTAPIFolder~Legacy Tasks|waitForCompletion~0|usecase~userAPIGetCatalogDetails-Admin|Type~JSON|METHOD~POST|Request~/app/api/rest?formatType=json&opName=userAPIGetCatalogDetails&opData={param0:\"sdkcat\"}^$^Description#userAPIGlobal@userAPIGetCatalogDetails: /app/api/rest?formatType=json&opName=userAPIGetCatalogDetails&opData={param0:\"sdkcat\"}^$^Description#userAPIGlobal@userAPIGetCatalogDetails",
				"TCOrder~1|RESTAPIFolder~Legacy Tasks|waitForCompletion~0|usecase~userAPIGetCatalogsPerGroup-Admin|Type~JSON|METHOD~POST|Request~/app/api/rest?formatType=json&opName=userAPIGetCatalogsPerGroup&opData={param0:\"Default Group\"}^$^Description#userAPIGlobal@userAPIGetCatalogsPerGroup: /app/api/rest?formatType=json&opName=userAPIGetCatalogsPerGroup&opData={param0:\"Default Group\"}^$^Description#userAPIGlobal@userAPIGetCatalogsPerGroup" };

		for (int h = 0; h < string.length; h++) {
			b.arrange(string[h]);
		}

	}

}
