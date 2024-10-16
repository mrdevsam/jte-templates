@param java.util.List<String> memberList

@template.layouts.main(content = @`
    <div class="bg-white shadow rounded-lg p-6">
        <h1 class="text-2xl font-bold mb-4">
            Our team
        </h1>
        <ul class="list-disc list-inside">
            @for(String member : memberList)
                <li class="text-gray-600">${member}</li>
            @endfor
        </ul>
    </div>
`)